package ar.edu.unlam.pb2.cuentasBancarias;

public abstract class  CuentaBancaria {
	protected Double saldo;
	
	public CuentaBancaria() {
		this.saldo = 0.00;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double valor) {
		this.saldo += valor;
		System.out.println("Ha depositado: $"+valor);
		System.out.println("Su saldo actual es: $"+saldo);
	};
	
	public abstract void extraer(Double valor);
}
