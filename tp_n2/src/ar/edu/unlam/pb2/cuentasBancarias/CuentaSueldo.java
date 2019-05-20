package ar.edu.unlam.pb2.cuentasBancarias;

public class CuentaSueldo extends CuentaBancaria{

	public CuentaSueldo() {
		super();
	}
	
	
	@Override
	public void extraer(Double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			System.out.println("CS.Ha retirado: $"+valor);
			System.out.println("CS.Su saldo actual es: $"+saldo);
		}else
			System.out.println("No se puede realizar la operación");
	}
}
	

