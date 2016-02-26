package com.iteso.design.cuentahabiente;

/**
 * Created by Sabino on 09/02/2016.
 */
public class CuentaHabiente {
    public String idCuentahabiente;
    public String Nombre;
    public String noCuenta;
    public String nipActual;
    public String nipAnterior;
    public boolean nipActivo;

    public CuentaHabiente(String idCuentahabiente, String nombre, String noCuenta)
    {
        this.idCuentahabiente = idCuentahabiente;
        this.Nombre = nombre;
        this.noCuenta = noCuenta;
    }
}
