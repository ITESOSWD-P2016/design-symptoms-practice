package com.iteso.design;

import com.iteso.design.cuentahabiente.impl.Cuentahabiente;

public class Directorio {
	public int numclientes=0;
	
	
	
	public void addCuentahabiente(Cuentahabiente c)
	{
		numclientes++;
	}
	
	public int getNumclientes()
	{
		return numclientes;
        
        
	
	}
}
