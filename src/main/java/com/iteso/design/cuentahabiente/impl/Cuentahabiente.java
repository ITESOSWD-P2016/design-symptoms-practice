package com.iteso.design.cuentahabiente.impl;

//cambiar_nip

public class Cuentahabiente {
    public String idCuentahabiente;
    public String Nombre;
    public String noCuenta;
    public String nipActual;
    public String nipAnterior;
    public boolean nipActivo;

    public Cuentahabiente()
    {

    }


    public Cuentahabiente(String idCuentahabiente, String nombre, String noCuenta)
    {
        this.idCuentahabiente = idCuentahabiente;
        this.Nombre = nombre;
        this.noCuenta = noCuenta;
    }





    public String GetCuentahabiente(int ID){
        return "Prueba";
    }
}