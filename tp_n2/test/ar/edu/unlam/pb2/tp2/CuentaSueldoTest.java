package ar.edu.unlam.pb2.tp2;


import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {
	@Test
	public void testQuePruebaQueNoSePuedeExtraerUnValorMayorAlSaldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.setSaldo(1500.00);
		Double extraccion = 3000.00;
		Double saldoEsperado = 1500.00;
		cuenta.extraer(extraccion);
		Assert.assertEquals(saldoEsperado, cuenta.getSaldo());
	}
}
