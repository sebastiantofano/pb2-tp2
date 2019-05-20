package ar.edu.unlam.pb2.cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria {
	private Double descubierto;
	private Double costoAd;

	public CuentaCorriente() {
		super();
		this.descubierto = 0.0;
		this.costoAd = 0.0;
	}
	
	@Override
	public void extraer(Double valor) {		
		if(valor <= saldo) {
			saldo -= valor;
			System.out.println("CC.Ha retirado: $"+valor);
			System.out.println("CC.Su saldo actual es: $"+saldo);
		}else {
			if(saldo > 0) {// si al momento de la operacion el saldo es positivo 
				descubierto = valor - saldo;
			}else {
				descubierto = valor;
			}
			//calcular el costo adicional de operacion que es el 5% del descubierto de la operacion
		costoAd = descubierto * 0.05; 
		// calcular el nuevo saldo que va a ser el saldo actual menos (el monto retirado + el costo adicional)
		saldo = saldo - (valor + costoAd);
		System.out.println("Ha retirado: $"+valor);
		System.out.println("Su saldo actual es: $"+saldo);
		}
		
		
	}
}
