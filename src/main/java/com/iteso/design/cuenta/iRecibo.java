package com.iteso.design.cuenta;

import com.iteso.design.tools.FileRead;

/**
 * Created by Sabino on 26/02/2016.
 */
public interface iRecibo {

    final int iAnchoColumna = 15;

    public void imprimirHistorial(int idCuentahabiente);

    public void imprimirUltimoMovimiento(int idCuentahabiente);

    public void imprimirSaldo (int idCuentahabiente);

    void imprimirInfoGeneral(int idCuentahabiente);

    void imprimirLinea();

    void imprimirIndentacion(int i);

    String obtenerNombreHistorial(int idCuentahabiente);

    void imprimirMovimiento(String sMovimiento);

    void imprimirEncabezadoMovimiento();
}
