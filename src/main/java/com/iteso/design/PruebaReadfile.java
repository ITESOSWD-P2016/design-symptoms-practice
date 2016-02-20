package com.iteso.design;

import java.io.IOException;

/**
 * Created by Sabino on 05/02/2016.
 */
public class PruebaReadfile {

    public static void main(String args[]) throws IOException {
        FileRead oFileRead = new FileRead("resources\\main\\java\\com\\iteso\\cuentahabiente\\cuentahabiente.csv");

//        Cuentahabiente oCuentahabienteEsperado = new Cuentahabiente("3", "Rodrigo", "9834");
//        Cuentahabiente oC = new Cuentahabiente(arg[0], arg[1], arg[2]);
//        System.out.println(oC.idCuentahabiente + " " +  oC.Nombre + " " + oC.noCuenta);
//        System.out.println(oCuentahabienteEsperado.idCuentahabiente + " " +  oCuentahabienteEsperado.Nombre + " " + oCuentahabienteEsperado.noCuenta);
        //READ´s
        //System.out.println(historialUsuario1.readLine(9));
        /*System.out.println(historialUsuario1.readLine(1));
        System.out.println(historialUsuario1.readlastLine());
        System.out.println(historialUsuario1.getIdMovimiento(3));
        System.out.println(historialUsuario1.getFechaDia(0));
        System.out.println(historialUsuario1.getFechaMes(0));
        System.out.println(historialUsuario1.getFechaAño(0));
        System.out.println(historialUsuario1.getTipodemovimiento(0));
        System.out.println(historialUsuario1.getCantidad(0));
        System.out.println(historialUsuario1.getSaldoanterior(0));
        System.out.println(historialUsuario1.getSaldonuevo(0));*/

        try {
            oFileRead.hacerRetiro();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
