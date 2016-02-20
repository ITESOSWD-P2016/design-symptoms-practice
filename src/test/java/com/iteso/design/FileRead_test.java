package com.iteso.design;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static java.io.File.separator;

public class FileRead_test {

	@Before
	public void SetUp(){
		
	}
	
	@Test
	public void test_getUltimoCuentahabiente(){
		FileRead oFileRead;
		Cuentahabiente oCuentahabiente;
		Cuentahabiente oCuentahabienteEsperado;
		
        //Esto equivale a  "resources" + separator + "main" + separator + "java" + separator + "com" + separator + "iteso" + separator + "cuentahabiente" + separator + "cuentahabiente.csv"
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv",separator);
        oFileRead = new FileRead(path);
        oCuentahabiente = oFileRead.getCuentahabienteInfo(1);
		oCuentahabienteEsperado = new Cuentahabiente("3", "Rodrigo", "9834");
	
		assertEquals(oCuentahabienteEsperado, oCuentahabiente);
	}
	
}
