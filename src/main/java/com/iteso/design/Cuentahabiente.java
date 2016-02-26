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
	
	public String getIdCuentahabiente() {
		return idCuentahabiente;
	}

	public void setIdCuentahabiente(String idCuentahabiente) {
		this.idCuentahabiente = idCuentahabiente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getNoCuenta() {
		return noCuenta;
	}

	public void setNoCuenta(String noCuenta) {
		this.noCuenta = noCuenta;
	}

	public String getNipActual() {
		return nipActual;
	}

	public void setNipActual(String nipActual) {
		this.nipActual = nipActual;
	}

	public String getNipAnterior() {
		return nipAnterior;
	}

	public void setNipAnterior(String nipAnterior) {
		this.nipAnterior = nipAnterior;
	}

	public boolean isNipActivo() {
		return nipActivo;
	}

	public void setNipActivo(boolean nipActivo) {
		this.nipActivo = nipActivo;
	}

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
