package com.iteso.design.tools;

import com.iteso.design.cuentahabiente.CuentaHabiente;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    static final  short AÑO = 2;

    public static final  short RETIRO = 0;
    public static final  short DEPOSITO = 1;


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

    public String readlastLine() {
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

    public String readLine(int line) {
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
    
    // Obtener la informacion de un cuentahabiente
    public CuentaHabiente getCuentahabienteInfo (int idCuentahabiente){
        String [] arrCuentahabienteInfo;
        if (idCuentahabiente == 0)
            arrCuentahabienteInfo = getData(readlastLine());
        else
            arrCuentahabienteInfo = getData(readLine(idCuentahabiente));

        if (arrCuentahabienteInfo[0] == "ERROR READING FILE")
            return null;
        else{
            return new CuentaHabiente(arrCuentahabienteInfo[0], arrCuentahabienteInfo[1], arrCuentahabienteInfo[2]);
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

    public int getFechaAño(int linea){
        String Data[]= getFecha(linea);
        int fechaaAño = Integer.parseInt(Data[AÑO]);
        return fechaaAño;
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

}
