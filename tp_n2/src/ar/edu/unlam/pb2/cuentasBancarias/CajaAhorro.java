package ar.edu.unlam.pb2.cuentasBancarias;

public class CajaAhorro extends CuentaBancaria {
	private Integer nroExt;
	private Double costoExt = 6.00;
	public CajaAhorro() {
		super();
		this.nroExt = 0;
	}
	
	@Override
	public void extraer(Double valor) {
		if(valor <= saldo) {
			if(nroExt < 5) {
				saldo -= valor;
				System.out.println("CA.Ha retirado: $"+valor);
				System.out.println("CA.Su saldo actual es: $"+saldo);
				nroExt ++; //Incrementa el numero de extracciones
			}else if((valor + costoExt) <= saldo) {
				saldo -= (valor + costoExt);
				System.out.println("CA.Ha retirado: $"+valor +" y se cobro un adicional de $6.00");
				System.out.println("CA.Su saldo actual es: $"+saldo);
				nroExt ++; //Incrementa el numero de extracciones
			}else {
				System.out.println("No se puede realizar la operación");
			}
		}else {
			System.out.println("No se puede realizar la operación");
		}
	}

	public Integer getNroExt() {
		return nroExt;
	}

	public void setNroExt(Integer nroExt) {
		this.nroExt = nroExt;
	}
	
	

}
