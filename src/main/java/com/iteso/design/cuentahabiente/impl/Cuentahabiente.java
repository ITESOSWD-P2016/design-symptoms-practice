package com.iteso.design.cuentahabiente.impl;

import com.iteso.design.cuentahabiente.iCuentahabiente;

/**
 * Created by Sabino on 09/02/2016.
 */
public class Cuentahabiente implements iCuentahabiente {
    public String idCuentahabiente;
    public String Nombre;
    public String noCuenta;
    public String nipActual;
    public String nipAnterior;
    public boolean nipActivo;

    public Cuentahabiente(String idCuentahabiente, String nombre, String noCuenta)
    {
        this.idCuentahabiente = idCuentahabiente;
        this.Nombre = nombre;
        this.noCuenta = noCuenta;
    }

	public void Cuentahabiente(String idCuentahabiente, String nombre, String noCuenta) {
		// TODO Auto-generated method stub
		
	}

	public void cambiarNIP() {
		// TODO Auto-generated method stub
		
	}

	public void desplegarInfo() {
		// TODO Auto-generated method stub
		
	}

	public void verInfoUsuario() {
		// TODO Auto-generated method stub
		
	}

	public void verInfoCuenta() {
		// TODO Auto-generated method stub
		
	}

	public void verInfoBanco() {
		// TODO Auto-generated method stub
		
	}




}