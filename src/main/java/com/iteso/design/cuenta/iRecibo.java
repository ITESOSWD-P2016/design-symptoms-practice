package com.iteso.design.cuenta;

import com.iteso.design.Cuentahabiente.Cuentahabiente;
import com.iteso.design.Tools.FileRead;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface iRecibo {


	void imprimirreciboDeSaldo();

	void imprimirReciboDeRetiro();

	void imprimirHistorial();

	void imprimirSaldoTelefono();

	void donativo();

	void ultimoMovimiento();



	
	private void imprimirEncabezadoMovimiento(){
		System.out.print("NoMovimiento");
		imprimirIndentacion(iAnchoColumna - new String("NoMovimiento").length());
		System.out.print("Fecha");
		imprimirIndentacion(iAnchoColumna - new String("Fecha").length());
		System.out.print("TipoMovimiento");
		imprimirIndentacion(iAnchoColumna - new String("TipoMovimiento").length());
		System.out.print("Cantidad");
		imprimirIndentacion(iAnchoColumna - new String("Cantidad").length());
		System.out.print("SaldoAnterior");
		imprimirIndentacion(iAnchoColumna - new String("SaldoAnterior").length());
		System.out.print("SaldoNuevo");
		imprimirIndentacion(iAnchoColumna - new String("SaldoNuevo").length());
		System.out.println();
		imprimirLinea();
	}
}

