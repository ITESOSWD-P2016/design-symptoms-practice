package com.iteso.design;
import org.junit.Test;

import com.iteso.design.cuentahabiente.impl.Cuentahabiente;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


//objeto dummy

public class Directorio_test {
	
	@Test
	public void addCuentahabientetest()
	{
		Cuentahabiente dummy = mock(Cuentahabiente.class);
		Directorio directorio1= new Directorio();
		directorio1.addCuentahabiente(dummy);
		
		assertEquals(1, directorio1.getNumclientes());
	}
	

}
