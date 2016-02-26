package com.iteso.design.cuenta;

public interface iRecibo {
	
	public void imprimirHistorial(int idCuentahabiente);
	public void imprimirUltimoMovimiento(int idCuentahabiente);
	public void imprimirSaldo (int idCuentahabiente);
	void imprimirInfoGeneral(int idCuentahabiente);
	public void imprimirReciboSaldoTelefonico();
	public void imprimirReciboDonativo();
	
	

}
