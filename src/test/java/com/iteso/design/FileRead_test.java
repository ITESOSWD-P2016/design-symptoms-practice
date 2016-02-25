package com.iteso.design;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static java.io.File.separator;


/**
 * Created by rvillalobos on 2/19/16.
 */
public class FileRead_test {

    @Test
    public void test_ultimoCuentahabiente() {

        //Esto equivale a  "resources" + separator + "main" + separator + "java" + separator + "com" + separator + "iteso" + separator + "cuentahabiente" + separator + "cuentahabiente.csv"
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv", separator);

        FileRead fileRead = new FileRead(path);
        Cuentahabiente cuentahabiente;
        Cuentahabiente cuentahabienteEsperado = new Cuentahabiente("03", "Rodrigo", "246313509760");

        cuentahabiente = fileRead.getCuentahabienteInfo(0);
        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;

        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);

    }


    public void test_CuentahabienteExistente() {


        FileRead fileRead = new FileRead(path);
        Cuentahabiente cuentahabiente;
        Cuentahabiente cuentahabienteEsperado = new Cuentahabiente("04", "Prueba1", "14252637383");

        cuentahabiente = fileRead.getCuentahabienteInfo(2);
        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;

        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);
    }


    public void test_CuentahabienteExistente() {


        FileRead fileRead = new FileRead(path);
        Cuentahabiente cuentahabiente;
        Cuentahabiente cuentahabienteEsperado = new Cuentahabiente("05", "Prueba2", "02524363737");

        cuentahabiente = fileRead.getCuentahabienteInfo(2);
        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;

        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);

    }

    public void test_CuentahabienteExistente() {

        FileRead fileRead = new FileRead(path);
        Cuentahabiente cuentahabiente;
        Cuentahabiente cuentahabienteEsperado = new Cuentahabiente("06", "Prueba2", "62324152627");

        cuentahabiente = fileRead.getCuentahabienteInfo(2);
        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;

        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);

    }

    @Test
    public void test_CuentahabienteNoExistente() {
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv", separator);

        FileRead fileRead = new FileRead(path);
        Cuentahabiente cuentahabiente;

        cuentahabiente = fileRead.getCuentahabienteInfo(07);
        assertNull(cuentahabiente);

    }
}