package com.iteso.design;

/**
 * Created by Sabino on 09/02/2016.
 */
public class Cuentahabiente {
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
	
    @Override
    public boolean equals(Object obj) {
    	Cuentahabiente oCuentahabiente = (Cuentahabiente) obj;
        return ((this.idCuentahabiente.equals(oCuentahabiente.idCuentahabiente))
        		&& (this.Nombre.equals(oCuentahabiente.Nombre))
        		&& (this.noCuenta.equals(oCuentahabiente.noCuenta)));
    }
}
