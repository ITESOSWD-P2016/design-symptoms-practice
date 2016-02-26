package com.iteso.design;
import org.junit.Test;

import com.iteso.design.cuentahabiente.impl.MyBankCuentahabiente;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockCuentahabiente_test {
	
	@Test
	public void test_MockCuentahabiente(){
		MyBankCuentahabiente mockedList = mock(MyBankCuentahabiente.class);
		mockedList.setNipActivo(true);
		assertTrue(mockedList.isNipActivo());
	}

}
