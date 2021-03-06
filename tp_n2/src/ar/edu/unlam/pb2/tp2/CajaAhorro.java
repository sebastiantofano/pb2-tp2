package ar.edu.unlam.pb2.tp2;

public class CajaAhorro extends CuentaBancaria{
	private Integer numeroExtraccion;
	
	public CajaAhorro() {
		this.numeroExtraccion = 0;
	}
	
	public Integer getNumeroExtraccion() {
		return this.numeroExtraccion;
	}
	public void setNumeroExtraccion(Integer valor) {
		this.numeroExtraccion = valor;
	}
	public void extraer(Double valor) {
		Double saldo = getSaldo();
		Double costoExtraccion = 6.00;
		Integer numeroExtraccion = getNumeroExtraccion();
		if (saldo >= valor) {
			if(numeroExtraccion <5) {
				saldo -= valor;
				setSaldo(saldo);
				
				System.out.print("Ha retirado: $"+valor);
				System.out.print("Su Saldo actual: $"+getSaldo());
			}else if (saldo >=(valor + costoExtraccion)){ //chequear que al agregar el costo de extraccion no supere el saldo en cuenta
				saldo -= valor + costoExtraccion;
				setSaldo(saldo);
				System.out.print("Ha retirado: $"+valor+" con un costo de operacion de: $"+costoExtraccion);
				System.out.print("Su Saldo actual: $"+getSaldo());
			}else {
				System.out.print("La operación no pudo realizarse porque el valor que desea retirar + el costo de extraccion"
						+ "supera el saldo de la cuenta");

			}
			
			numeroExtraccion ++; // incremento el numero de extraccion en 1
			setNumeroExtraccion(numeroExtraccion);
		}else {
			System.out.print("La operación no pudo realizarse porque la cuenta no dispone suficientes fondos");
		}	
	}
	
}
