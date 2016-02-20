package com.iteso.design;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Recibo {
	FileRead fileReader;
	private final int iAnchoColumna = 15;
	
	public void imprimirHistorial(int idCuentahabiente){
		String sMovimiento = new String();
		Cuentahabiente oCuentahabiente;
		
		oCuentahabiente = validarCuentahabiente(idCuentahabiente);
		if (oCuentahabiente == null){
			System.out.println("Cuentahabiente no válido");
			return;
		}
		
		imprimirInfoGeneral(oCuentahabiente);
		System.out.println("HISTORIAL DE MOVIMIENTOS");
		imprimirEncabezadoMovimiento();
		// Abrir el archivo correspondiente
		String sFile = obtenerNombreHistorial(idCuentahabiente);
		this.fileReader = new FileRead(sFile.toString());
		sMovimiento = fileReader.readLine(1);
		for (int i = 2; sMovimiento != "ERROR READING FILE"; i++){
			imprimirMovimiento(sMovimiento);
			sMovimiento = fileReader.readLine(i);
		}
		imprimirLinea();
		System.out.println();
		System.out.println();
	}
	
	public void imprimirUltimoMovimiento(int idCuentahabiente){
		String sMovimiento;
		Cuentahabiente oCuentahabiente;
		oCuentahabiente = validarCuentahabiente(idCuentahabiente);
		if (oCuentahabiente == null){
			System.out.println("Cuentahabiente no válido");
			return;
		}
		System.out.println("ÚLTIMO MOVIMIENTO");
		imprimirEncabezadoMovimiento();
		
		// Abrir el archivo correspondiente
		String sFile = obtenerNombreHistorial(idCuentahabiente);
		this.fileReader = new FileRead(sFile.toString());
		sMovimiento = fileReader.readlastLine();

		imprimirMovimiento(sMovimiento);
		imprimirLinea();
		System.out.println();
		System.out.println();
		
	}
	
	public void imprimirSaldo (int idCuentahabiente){
		// Imprimir encabezado general
		Cuentahabiente oCuentahabiente;
		oCuentahabiente = validarCuentahabiente(idCuentahabiente);
		if (oCuentahabiente == null){
			System.out.println("Cuentahabiente no válido");
			return;
		}
		
		// Imprimir recibo desaldo
		System.out.print("SALDO ACTUAL:");
		imprimirIndentacion(iAnchoColumna - new String("SALDO ACTUAL:").length());
		
		// Abrir el archivo correspondiente
		String sFile = obtenerNombreHistorial(idCuentahabiente);
		this.fileReader = new FileRead(sFile.toString());
		System.out.println("$" + fileReader.getSaldonuevo(0) + ".00");
		fileReader.closeFile();
		imprimirLinea();
		System.out.println();
		System.out.println();
	}
	
	private void imprimirInfoGeneral(Cuentahabiente oCuentahabiente){
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		
		// Imprimir encabezado del recibo
		imprimirLinea();
		imprimirIndentacion(43);
		System.out.println("MyBank");
		imprimirLinea();
		System.out.print("Nombre:");
		imprimirIndentacion(iAnchoColumna - new String("Nombre:").length());
		System.out.println(oCuentahabiente.Nombre);
		System.out.print("No. Cuenta:");
		imprimirIndentacion(iAnchoColumna - new String("No. Cuenta:").length());
		System.out.println(oCuentahabiente.noCuenta);
		System.out.print("Fecha:");
		imprimirIndentacion(iAnchoColumna - new String("Fecha:").length());
		System.out.println(dateFormat.format(date) + "\n\n"); 
		
		fileReader.closeFile();
	}
	
	private Cuentahabiente validarCuentahabiente(int idCuentahabiente){
		
		this.fileReader = new FileRead("resources\\main\\java\\com\\iteso\\cuentahabiente\\cuentahabiente.csv");
		return this.fileReader.getCuentahabienteInfo(idCuentahabiente);
	}
	
	private void imprimirLinea(){
		for (int i = 0; i < 30; i++) System.out.print("---");
		System.out.println();
	}
	
	private void imprimirIndentacion(int i){
		for(int j = 0; j < i; j++) System.out.print(" ");
	}
	
	private String obtenerNombreHistorial(int idCuentahabiente){
		StringBuilder sFile = new StringBuilder("resources\\main\\java\\com\\iteso\\cuentahabiente\\historial\\");
		sFile.append(String.format("%04d", idCuentahabiente));
		sFile.append(".csv");
		return sFile.toString();
	}
	
	private void imprimirMovimiento(String sMovimiento){
		int noCampos = 6;
		String [] arrMovimiento = new String[noCampos];
		arrMovimiento = sMovimiento.split(",");

		if (arrMovimiento[2].equals("0")) {
			arrMovimiento[2] = "Retiro";
		} else if (arrMovimiento[2].equals("1")) {
			arrMovimiento[2] = "Depï¿½sito";
		} else if (arrMovimiento[2].equals("2")) {
			arrMovimiento[2] = "Donativo";
		} else if (arrMovimiento[2].equals("3")) {
			arrMovimiento[2] = "Recarga tel";
		}
		
		for (int i = 3; i < 6; i++)
			arrMovimiento[i] = "$" + arrMovimiento[i];
		
		for (int i = 0; i < noCampos; i++){
			System.out.print(arrMovimiento[i]);
			imprimirIndentacion(iAnchoColumna - arrMovimiento[i].length());
		}
		System.out.println();
	}
	
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

