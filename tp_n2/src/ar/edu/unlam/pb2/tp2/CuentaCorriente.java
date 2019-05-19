package ar.edu.unlam.pb2.tp2;

public class CuentaCorriente extends CuentaBancaria{
	public CuentaCorriente() {
		
	}
	
//en este tipo de cuenta el saldo puede ser negativo
//porque permite extraer dinero en descubierto
//todo lo que se extraiga en descubierto restará al saldo (haciendolo un numero mas grande NEGATIVO)
	
	public void extraer(Double valor) {
		Double saldo = getSaldo();
		Double descubiertoDeOperacion;
		Double costoAdicional;
		// si el saldo es mayor al valor a extraer, se hace igual que todas las cuentas
		if(saldo > valor) {
			saldo -= valor;
			setSaldo(saldo);
			System.out.print("Ha retirado: $"+valor);
			
		}else { // si el saldo en cuenta es menor que el valor que se quiere retirar hay que calcular cuanto
			// va a valer el descubierto de la operacion.
			if (saldo > 0) { // si al momento de la operacion el saldo es positivo 
							// hay que calcular la diferencia entre el saldo y el valor a retirar
				descubiertoDeOperacion = valor - saldo; // en ese orden para que me de un valor positivo
			}else { // si al momento de la operacion es saldo es negativo o cero
					// todo el valor a retirar va a ser en descubierto
				descubiertoDeOperacion = valor;
			}
			//calcular el costo adicional de operacion que es el 5% del descubierto de la operacion
			costoAdicional = descubiertoDeOperacion * 0.05;
			// calcular el nuevo saldo que va a ser el saldo actual menos (el monto retirado + el costo adicional)
			saldo = saldo - (valor + costoAdicional);
			//setear el nuevo saldo
			setSaldo(saldo); 
		}
	}
}
