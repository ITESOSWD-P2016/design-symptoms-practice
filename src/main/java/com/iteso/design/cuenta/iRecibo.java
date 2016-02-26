package com.iteso.design.cuenta;

public interface iRecibo {
	public void imprimirSaldo(int idCuentahabiente);
	public void imprimirRetiro();
	public void imprimirHistorial(int idCuentahabiente);
	public void imprimirSaldoTelefonico();
	public void imprimirDonativo();
	public void imprimirUltimoMovimiento(int idCuentahabiente);
}
