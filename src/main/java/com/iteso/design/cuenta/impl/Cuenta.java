package com.iteso.design.cuenta.impl;

import javax.swing.*;

import com.iteso.design.cuenta.iCuenta;
import com.iteso.design.tools.FileRead;

import java.io.IOException;

/**
 * Created by Sabino on 09/02/2016.
 */
public class Cuenta implements iCuenta {
    FileRead fileRead;

    public void hacerRetiro() throws IOException {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuanto deseas retirar"));

        if(cantidad%20 == 0 || cantidad%50 == 0){
            if(fileRead.getSaldonuevo(0) - cantidad<0)System.out.println("La accion que dessea hacer no es posible Usted desea retirar "+cantidad+" lo cual excede su saldo actual de " + fileRead.getSaldonuevo(0));
            else {
                fileRead.setNewHistory(fileRead.getIdMovimiento(0), fileRead.getSystemDate(), fileRead.RETIRO, cantidad, fileRead.getSaldoanterior(0), fileRead.getSaldonuevo(0) - cantidad);
                System.out.println("Felicidades se han retirado " + cantidad + " pesos con exito :3");
            }
        }else{
            System.out.println("NO se puede retirar :"+cantidad);
            System.out.println("Solo da billetes de:20,100,200,500,1000");
        }
    }

    public void imprimirRecibo() {
        // TODO Auto-generated method stub

    }

    public void cambiarNIP() {
        // TODO Auto-generated method stub

    }

    public void verHistorial() {
        // TODO Auto-generated method stub

    }

    public void hacerDonacion() {
        // TODO Auto-generated method stub

    }

    public void ponerSaldoTelefonico() {
        // TODO Auto-generated method stub

    }

}