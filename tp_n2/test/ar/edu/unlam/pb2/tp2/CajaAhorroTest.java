package ar.edu.unlam.pb2.tp2;

import org.junit.Assert;
import org.junit.Test;

public class CajaAhorroTest {
	@Test
	public void testQuePruebaQueAlDepositarConSaldoCeroElSaldoNuevoVaASerIgualAlDeposito() {
		CajaAhorro cuenta = new CajaAhorro();
		Double deposito = 2000.00;
		Double saldoEsperado = 2000.00;
		cuenta.depositar(deposito);
		Assert.assertEquals(saldoEsperado, cuenta.getSaldo());
	}
	
	@Test
	public void testQuePruebaQueAlDepositarConSaldoXElSaldoNuevoEsLaSumaDeEsteMasElDeposito() {
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.setSaldo(1500.00);
		Double deposito = 2000.00;
		Double saldoEsperado = 3500.00;
		cuenta.depositar(deposito);
		Assert.assertEquals(saldoEsperado, cuenta.getSaldo());
	}
	
	@Test
	public void testQuePruebaQueAlExtraerElSaldoRestaElMismoValor() {
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.setSaldo(1500.00);
		Double extraccion = 1000.00;
		Double saldoEsperado = 500.00;
		cuenta.extraer(extraccion);
		Assert.assertEquals(saldoEsperado, cuenta.getSaldo());
	}
	
	@Test
	public void testQuePruebaQueAlExtraerPorQuintaVezSeCobraUnAdicional() {
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.setNumeroExtraccion(6);
		cuenta.setSaldo(100.00);
		Double extraccion = 50.00;
		Double saldoEsperado = 44.00;
		cuenta.extraer(extraccion);
		Assert.assertEquals(saldoEsperado, cuenta.getSaldo());
	}
	
}
