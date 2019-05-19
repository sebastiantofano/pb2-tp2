package ar.edu.unlam.pb2.tp2;

public class CajaAhorro extends CuentaBancaria{
	private Integer numeroExtraccion;
	
	public CajaAhorro() {
		this.numeroExtraccion = 0;
	}
	
	public Integer getNumeroExtraccion() {
		return this.numeroExtraccion;
	}
	
	public void extraer(Double valor) {
		Double saldo = getSaldo();
		Double costoExtraccion = 6.00;
		if (saldo >= valor) {
			if(numeroExtraccion <5) {
				saldo -= valor;
				setSaldo(saldo);
				
				System.out.print("Ha retirado: $"+valor);
			}else if (saldo >=(valor + costoExtraccion)){ //chequear que al agregar el costo de extraccion no supere el saldo en cuenta
				saldo -= valor + costoExtraccion;
				setSaldo(saldo);
				System.out.print("Ha retirado: $"+valor+" con un costo de operacion de: $"+costoExtraccion);
			}else {
				System.out.print("La operación no pudo realizarse porque el valor que desea retirar + el costo de extraccion"
						+ "supera el saldo de la cuenta");
			}
			
			numeroExtraccion ++; // incremento el numero de extraccion en 1
		}else {
			System.out.print("La operación no pudo realizarse porque la cuenta no dispone suficientes fondos");
		}	
	}
	
}
