package com.iteso.design;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iteso.design.cuentahabiente.impl.MyBankCuentahabiente;
import com.iteso.design.tools.FileRead;

import static java.io.File.separator;

public class FileRead_test {
	FileRead oFileRead;
	MyBankCuentahabiente oCuentahabiente;
	MyBankCuentahabiente oCuentahabienteEsperado;
	
	@Before
	public void SetUp(){
        //Esto equivale a  "resources" + separator + "main" + separator + "java" + separator + "com" + separator + "iteso" + separator + "cuentahabiente" + separator + "cuentahabiente.csv"
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv",separator);
        oFileRead = new FileRead(path);
	}
	
	@Test
	public void test_getUltimoCuentahabiente(){
        oCuentahabiente = oFileRead.getCuentahabienteInfo(0);
		oCuentahabienteEsperado = new MyBankCuentahabiente("3", "Rodrigo", "9834");
	
		assertEquals(oCuentahabienteEsperado, oCuentahabiente);
	}
	
	@Test
	public void test_getCuentahabienteNoValido(){
        oCuentahabiente = oFileRead.getCuentahabienteInfo(3);
		oCuentahabienteEsperado = null;
	
		assertNull(oCuentahabienteEsperado);
	}
	
	@Test
	public void test_getCuentahabiente(){
        oCuentahabiente = oFileRead.getCuentahabienteInfo(1);
		oCuentahabienteEsperado = new MyBankCuentahabiente("3", "Rodrigo", "9834");
	
		assertEquals(oCuentahabienteEsperado, oCuentahabiente);
	}
	
}
