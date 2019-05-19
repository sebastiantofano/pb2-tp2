package ar.edu.unlam.pb2.tp2;

public class CuentaSueldo extends CuentaBancaria {
	
	public CuentaSueldo() {
		
	}
	
	public void extraer(Double valor) {
		Double saldo = getSaldo();
		if (saldo >= valor) {
			saldo -= valor;
			setSaldo(saldo);
			System.out.print("Ha retirado: $"+valor);
		}else {
			System.out.print("La operación no pudo realizarse porque la cuenta no dispone suficientes fondos");
		}
	}
}
