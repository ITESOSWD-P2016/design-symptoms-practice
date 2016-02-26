package com.iteso.design;

import com.iteso.design.Tools.FileRead;

import java.io.IOException;

/**
 * Created by Sabino on 05/02/2016.
 */
public class PruebaReadfile {

    public static void main(String args[]) throws IOException {
        FileRead historialUsuario1 = new FileRead("resources\\main\\java\\com\\iteso\\cuentahabiente\\historial\\0001.csv");


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
            historialUsuario1.hacerRetiro();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
