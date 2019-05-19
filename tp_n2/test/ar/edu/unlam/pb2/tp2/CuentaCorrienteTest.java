package ar.edu.unlam.pb2.tp2;

import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrienteTest {
	@Test
	public void testQuePruebaQueAlExtraerEnDescubiertoCobraUnPorcentaje() {
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.setSaldo(5.00);
		Double extraccion = 10.00;
		Double saldoEsperado = -5.25;
		cuenta.extraer(extraccion);
		Assert.assertEquals(saldoEsperado, cuenta.getSaldo());
	}
}
