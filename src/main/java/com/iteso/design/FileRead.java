package com.iteso.design;

import javax.swing.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Sabino on 05/02/2016.
 */

public class FileRead {
    static final  short IDMOVIMIENTO = 0;
    static final  short FECHA = 1;
    static final  short TIPODEMOVIMIENTO = 2;
    static final  short CANTIDAD = 3;
    static final  short SALDOANTERIOR = 4;
    static final  short SALDONUEVO = 5;

    static final  short DIA = 0;
    static final  short MES = 1;
    static final  short ANIO = 2;

    static final  short RETIRO = 0;
    static final  short DEPOSITO = 1;


    File archivo;
    FileReader fr;
    BufferedReader br;
    String cadena;

    FileWriter fw;
    BufferedWriter bw;


    public FileRead(String file) {
        this.archivo = new File(file);
    }
    
    public void closeFile(){
    	if (br!= null)
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }

    private void createBufferReader(){
        try{
            fr = new FileReader(archivo);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(fr);
    }

    private void createBufferWiter(){
        try{
            fw = new FileWriter(archivo,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bw = new BufferedWriter(fw);
    }

    String readlastLine() {
        String last = "";
        createBufferReader();
        try {
            while (( cadena = br.readLine()) != null) {
                last = cadena;
            }
            return  last;

        }catch (IOException e) {
            e.printStackTrace();
        }
        return "ERROR READING FILE";
    }

    String readLine(int line) {
        createBufferReader();
        int counter = 0;
        try {
            while ((cadena = br.readLine()) != null) {
                counter++;
                if(counter == line){
                    return cadena;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ERROR READING FILE";
    }

    //--------------------------ORDEN DE CAMPOS--------------------------------------------
    // IdMovimiento, Fecha, Tipo de movimiento (retiro "0" , depósito "1"), Cantidad, SaldoAnterior, SaldoNuevo.

    private String[] getData(String Datos){
        String DatosArray[] = Datos.split(",");
       return DatosArray;
    }

    /**Esta funcion validara la linea , en dado caso que la linea que se requiera leer sea 0 (como no es posible leer esa )leera la ultima linea*/
    private String[] getDataValidated(int linea){
        if(0==linea)return getData(readlastLine());
        else return getData(readLine(linea));
    }
    
    // Obtener la informaci�n de un cuentahabiente
    public Cuentahabiente getCuentahabienteInfo (int idCuentahabiente){
    	String [] arrCuentahabienteInfo= null;
    	
    	if (idCuentahabiente == 0)
    		arrCuentahabienteInfo = getData(readlastLine());
    	else
    		arrCuentahabienteInfo = getData(readLine(idCuentahabiente));
    	
    	if (arrCuentahabienteInfo[0] == "ERROR READING FILE")
    		return null;
    	else{
    		return new Cuentahabiente(arrCuentahabienteInfo[0], arrCuentahabienteInfo[1], arrCuentahabienteInfo[2]);
    	}
    }

    public int getIdMovimiento(int linea){
        String Data[]= getDataValidated(linea);
        int IdMovimiento = Integer.parseInt(Data[IDMOVIMIENTO]);
        return IdMovimiento;
    }

    private String[] getFecha(int linea){
        String Data[]= getDataValidated(linea);
        return Data[FECHA].split("/");
    }

    public int getFechaDia(int linea){
        String Data[]= getFecha(linea);
        int fechadia = Integer.parseInt(Data[DIA]);
        return fechadia;
    }

    public int getFechaMes(int linea){
        String Data[]= getFecha(linea);
        int fechames = Integer.parseInt(Data[MES]);
        return fechames;
    }

    public int getFechaAnio(int linea){
        String Data[]= getFecha(linea);
        int fechaaAnio = Integer.parseInt(Data[ANIO]);
        return fechaaAnio;
    }

    public int getTipodemovimiento(int linea){
        String Data[]= getDataValidated(linea);
        int Tipodemovimiento = Integer.parseInt(Data[TIPODEMOVIMIENTO]);
        return Tipodemovimiento;
    }

    public int getCantidad(int linea){
        String Data[]= getDataValidated(linea);
        int Cantidad = Integer.parseInt(Data[CANTIDAD]);
        return Cantidad;
    }

    public int getSaldoanterior(int linea){
        String Data[]= getDataValidated(linea);
        int Saldoanterior = Integer.parseInt(Data[SALDOANTERIOR]);
        return Saldoanterior;
    }

    public int getSaldonuevo(int linea){
        String Data[]= getDataValidated(linea);
        int Saldonuevo = Integer.parseInt(Data[SALDONUEVO]);
        return Saldonuevo;
    }

    //-------------------------------------- Write File ----------------------------------------------------------------------

    public void setNewHistory(int IdMovimiento,String Fecha,int tipoMovimiento,int cantidad,int saldoAnterior,int saldoNuevo) throws IOException {
        createBufferWiter();

        String nuevaHistoria =  "\n"+String.valueOf(IdMovimiento)+","+
                                Fecha+","+
                                String.valueOf(tipoMovimiento)+",0"+
                                String.valueOf(cantidad)+","+
                                String.valueOf(saldoAnterior)+","+
                                String.valueOf(saldoNuevo);

        bw.write(nuevaHistoria);
        bw.close();
    }

    public String getSystemDate(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    public void hacerRetiro() throws IOException {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuanto deseas retirar"));

        if(cantidad%20 == 0 || cantidad%50 == 0){
            if(getSaldonuevo(0) - cantidad<0)System.out.println("La accion que dessea hacer no es posible Usted desea retirar "+cantidad+" lo cual excede su saldo actual de " + getSaldonuevo(0));
            else {
                setNewHistory(getIdMovimiento(0), getSystemDate(), RETIRO, cantidad, getSaldoanterior(0), getSaldonuevo(0) - cantidad);
                System.out.println("Felicidades se han retirado " + cantidad + " pesos con exito :3");
            }
        }else{
            System.out.println("NO se puede retirar :"+cantidad);
            System.out.println("Solo da billetes de:20,100,200,500,1000");
        }
    }

}
