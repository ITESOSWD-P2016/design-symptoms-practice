package com.iteso.design.cuenta;

import com.iteso.design.cuentahabiente.CuentaHabiente;
import com.iteso.design.tools.FileRead;

import javax.swing.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sabino on 26/02/2016.
 */
public interface iCuenta {

    public void hacerRetiro() throws IOException;


}
