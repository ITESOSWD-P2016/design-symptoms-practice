package com.iteso.design;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static java.io.File.separator;


/**
 * Created by rvillalobos on 2/19/16.
 */
public class FileRead_test {

    @Test
    public void test_ultimoCuentahabiente(){

        //Esto equivale a  "resources" + separator + "main" + separator + "java" + separator + "com" + separator + "iteso" + separator + "cuentahabiente" + separator + "cuentahabiente.csv"
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv",separator);

        FileRead fileRead = new FileRead(path);
        Cuentahabiente cuentahabiente;
        Cuentahabiente cuentahabienteEsperado = new Cuentahabiente("03","Rodrigo","246313509760");

        cuentahabiente = fileRead.getCuentahabienteInfo(0);
        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;

        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);

    }
}
