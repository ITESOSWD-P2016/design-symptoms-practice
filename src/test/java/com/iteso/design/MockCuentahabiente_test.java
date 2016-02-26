package com.iteso.design;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockCuentahabiente_test {
	
	@Test
	public void test_MockCuentahabiente(){
		Cuentahabiente mockedList = mock(Cuentahabiente.class);
		mockedList.setNipActivo(true);
		assertTrue(mockedList.isNipActivo());
	}

}
