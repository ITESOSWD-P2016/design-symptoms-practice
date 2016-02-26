package com.iteso.design;


import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static java.io.File.separator;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


/**
 * http://stackoverflow.com/questions/3459287/whats-the-difference-between-a-mock-stub

 * Dummy - just bogus values to satisfy the API.
 - Example: If you're testing a method of a class which requires many mandatory parameters in a constructor which have no
            effect on your test, then you may create dummy objects for the purpose of creating new instances of a class.

 * Fake - create a test implementation of a class which may have a dependency on some external infrastructure. (It's
          good practice that your unit test does NOT actually interact with external infrastructure.)
 - Example: Create fake implementation for accessing a database, replace it with in-memory collection.

 * Stub - override methods to return hard-coded values, also referred to as state-based.
 - Example: Your test class depends on a method Calculate() taking 5 minutes to complete. Rather than wait for 5 minutes
            you can replace its real implementation with stub that returns hard-coded values; taking only a small fraction
            of the time.

 * Mock - very similar to Stub but interaction-based rather than state-based. This means you don't expect from Mock to
          return some value, but to assume that specific order of method calls are made.
 - Example: You're testing a user registration class. After calling Save, it should call SendConfirmationEmail.
 */
public class FileRead_Test {



    @Test
    public void test_UltimoCuentahabiente(){

        //Esto equivale a  "resources" + separator + "main" + separator + "java" + separator + "com" + separator + "iteso" + separator + "cuentahabiente" + separator + "cuentahabiente.csv"
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv",separator);



        FileRead fileRead = new FileRead(path);


        /* Ejemplo de Mock */

        Cuentahabiente cuentahabiente = Mockito.mock(Cuentahabiente.class);

        cuentahabiente.GetCuentahabiente(2);
        cuentahabiente.GetCuentahabiente(3);
        cuentahabiente.GetCuentahabiente(3);

        // now check if method GetCuentahabiente was called with the parameter 2
        verify(cuentahabiente).GetCuentahabiente(Matchers.eq(2));

        // was the method called twice?
        verify(cuentahabiente, times(2)).GetCuentahabiente(3);

        Cuentahabiente cuentahabienteEsperado = new Cuentahabiente("03","Rodrigo","246313509760");

        cuentahabiente = fileRead.getCuentahabienteInfo(0);

        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;
        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);

    }

    /* Ejemplo de Stub */

    class CuentahabienteStub extends Cuentahabiente {
        CuentahabienteStub(int ID) {
            this.idCuentahabiente = "02";
            this.Nombre = "Criss";
            this.noCuenta = "124816326412";
        }
    }

    @Test
    public void test_ExisteCuentahabiente(){
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv",separator);
        FileRead fileRead = new FileRead(path);

        Cuentahabiente cuentahabiente;

        /* Stub en acción */
        CuentahabienteStub cuentahabienteEsperado = new CuentahabienteStub(2);


        cuentahabiente = fileRead.getCuentahabienteInfo(2);
        String esperado = cuentahabienteEsperado.idCuentahabiente + cuentahabienteEsperado.Nombre + cuentahabienteEsperado.noCuenta;

        String actual = cuentahabiente.idCuentahabiente + cuentahabiente.Nombre + cuentahabiente.noCuenta;
        assertEquals(esperado, actual);
    }





        @Test
    public void test_InexistenteCuentahabiente(){
        String path = String.format("resources%1$smain%1$sjava%1$scom%1$siteso%1$scuentahabiente%1$scuentahabiente.csv",separator);
        FileRead fileRead = new FileRead(path);
        Cuentahabiente cuentahabiente;

        cuentahabiente = fileRead.getCuentahabienteInfo(69);
        // assertNull(cuentahabiente); // Se ha sacrificado a favor de usar el DummySystem :(

        /* Ejemplo de Dummy */
        Cuentahabiente Dummy = null;
        assertEquals(cuentahabiente, Dummy);
    }

}



