package com.iteso.design;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static java.io.File.separator;

/**
 * Created by jorgeruvalcaba on 2/19/16.
 */
public class FileRead_test {

    FileRead FileRead_t;
    Cuentahabiente cuentahabiente_t;
    Cuentahabiente cuentahabienteEsperado_t;

    @Before
    public void setUp() {
        //Esto equivale a  "resources" + separator + "main" + separator + "java" + separator + "com" + separator + "iteso" + separator + "cuentahabiente" + separator + "cuentahabiente.csv"
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv", separator);
        FileRead_t = new FileRead(path);
    }

    // Test case IdCuentahabiente = 0
    @Test
    public void test_ultimoCuentahabiente() {

        cuentahabienteEsperado_t = new Cuentahabiente("5", "Rodrigo", "1234567890");
        cuentahabiente_t = FileRead_t.getCuentahabienteInfo(0);

        String esperado = cuentahabienteEsperado_t.idCuentahabiente + cuentahabienteEsperado_t.Nombre + cuentahabienteEsperado_t.noCuenta;
        String actual = cuentahabiente_t.idCuentahabiente + cuentahabiente_t.Nombre + cuentahabiente_t.noCuenta;

        assertEquals(esperado, actual);

    }

    // Test case IdCuentahabiente Existente
    @Test
    public void test_cuentahabienteExistente() {

        cuentahabienteEsperado_t = new Cuentahabiente("5", "Rodrigo", "1234567890");
        cuentahabiente_t = FileRead_t.getCuentahabienteInfo(1);

        assertEquals(cuentahabienteEsperado_t,cuentahabiente_t);

    }

    // Test case IdCuentahabiente no existente
    @Test
    public void test_cuentahabienteNoExistente() {

        cuentahabienteEsperado_t = null;
        cuentahabiente_t = FileRead_t.getCuentahabienteInfo(5);

        assertNull(cuentahabienteEsperado_t);

    }
}