package ar.edu.unlam.pb2.tp2;

public class CuentaBancaria {
	private Double saldo;

	public CuentaBancaria() {

	}

	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(Double valor) {
		this.saldo = valor;
	}
	
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public void extraer(Double valor) {
	}
	
}
