package com.iteso.design.cuenta;

import java.io.IOException;

public interface iCuenta {

    public void hacerRetiro() throws IOException;

    public void cambiarNIP();

    public void imprimirRecibo();

    public void verHistorial();

    public void hacerDonacion();

    public void ponerSaldoTelefonico();

}