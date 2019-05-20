package ar.edu.unlam.pb2.cuentasBancarias;

import org.junit.Assert;
import org.junit.Test;

public class CuentaBancariaTest {

	@Test
	public void TestQuePruebaElDepositoDeSaldo() {
		CuentaBancaria cuenta1 = new CuentaSueldo();
		
		cuenta1.depositar(3000.0);
		Double saldoEsperado = 3000.0;
		
		Assert.assertEquals(saldoEsperado, cuenta1.getSaldo());
		//Porque si pongo cuenta1.saldo puedo acceder?Tengo que usar private o protected en la superclase?Preguntar
		}
	
	//TEST GENERAL DE DEPOSITO
	@Test
	public void TestQuePruebaLaExtraccionDeSaldoCS() {
		CuentaBancaria cuenta1 = new CuentaSueldo();
		
		cuenta1.setSaldo(5000.0);
		cuenta1.extraer(3000.0);
		Double saldoEsperado = 2000.0;
		
		Assert.assertEquals(saldoEsperado, cuenta1.getSaldo());
	}
	
	//TESTS DE CUENTA SUELDO
	@Test
	public void TestQuePruebaFondosInsuficientesCS() {
		CuentaBancaria cuenta1 = new CuentaSueldo();
		
		cuenta1.setSaldo(5000.0);
		cuenta1.extraer(7000.0);
		Double saldoEsperado = cuenta1.getSaldo();
		
		Assert.assertEquals(saldoEsperado, cuenta1.getSaldo());
		}
	
	//TEST DE CAJA DE AHORRO
	@Test
	public void TestQuePruebaLaExtracionNormalDeSaldoCA() {
		CuentaBancaria cuenta2 = new CajaAhorro();
		
		cuenta2.setSaldo(500.0);
		cuenta2.extraer(50.0);
		Double saldoEsperado = 450.0;
		
		Assert.assertEquals(saldoEsperado, cuenta2.getSaldo());
		}
	
	@Test
	public void TestQuePruebaLaQuintaExtraccionDeSaldo1CA() {
		CuentaBancaria cuenta2 = new CajaAhorro();
		
		cuenta2.setSaldo(100.0);
		((CajaAhorro)cuenta2).setNroExt(8);
		cuenta2.extraer(50.0);
		Double saldoEsperado = 44.0;
		
		Assert.assertEquals(saldoEsperado, cuenta2.getSaldo());
		}
	
	//TEST DE CUENTA CORRIEENTE
	
	@Test
	public void TestQuePruebaLaExtracionNormalDeSaldoCC() {
		CuentaBancaria cuenta3 = new CuentaCorriente();
		
		cuenta3.setSaldo(300.0);
		cuenta3.extraer(50.0);
		Double saldoEsperado = 250.0;
		
		Assert.assertEquals(saldoEsperado, cuenta3.getSaldo());
		}
	@Test
	public void TestQuePruebaLaExtracionDescubiertoDeSaldoCC() {
		CuentaBancaria cuenta3 = new CuentaCorriente();
		
		cuenta3.setSaldo(100.0);
		cuenta3.extraer(200.0);
		Double saldoEsperado = -105.0;
		
		Assert.assertEquals(saldoEsperado, cuenta3.getSaldo());
		}
	
}
