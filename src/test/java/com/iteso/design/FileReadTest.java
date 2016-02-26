package com.iteso.design;
import com.iteso.design.cuentahabiente.CuentaHabiente;
import com.iteso.design.pin.impl.PIN_4digits;
import com.iteso.design.pin.PIN;
import com.iteso.design.tools.FileRead;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by Sabino on 19/02/2016.
 */
public class FileReadTest {

    @Before
    public void setUp(){

    }

    @Test
    public void testReadRealUser(){
        FileRead fileRead = new FileRead("resources\\main\\java\\com\\iteso\\cuentahabiente\\cuentahabiente.csv");
        CuentaHabiente cuentahabiente;
        CuentaHabiente cuentahabienteEsperado = new CuentaHabiente("03","Rodrigo","246313509760");

        cuentahabiente = fileRead.getCuentahabienteInfo(1);
        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;

        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);
    }

    @Test
    public void tesUltimoCuentahabiente(){
        FileRead fileRead = new FileRead("resources\\main\\java\\com\\iteso\\cuentahabiente\\cuentahabiente.csv");
        CuentaHabiente cuentahabiente;
        CuentaHabiente cuentahabienteEsperado = new CuentaHabiente("03","Rodrigo","246313509760");

        cuentahabiente = fileRead.getCuentahabienteInfo(0);
        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;

        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);
    }

    @Test
    public void testReadUnrealUser(){
        FileRead fileRead = new FileRead("resources\\main\\java\\com\\iteso\\cuentahabiente\\cuentahabiente.csv");
        CuentaHabiente cuentahabiente;
        cuentahabiente = fileRead.getCuentahabienteInfo(8);

        assertNull(cuentahabiente);
    }

    @Test
    public void testMock(){
        PIN pin = Mockito.mock(PIN.class);
        when(pin.AskForPin()).thenReturn("Pin");

        // use mock in test....
        assertEquals(pin.AskForPin(), "Pin");
    }


    @Test
    public void testStub(){
            PIN service  = new PIN_4digits();
    }



}


