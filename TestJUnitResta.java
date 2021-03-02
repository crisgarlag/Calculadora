/**
 * Tests pruebas clase Resta compañera
 * @author Alberto Aguado
 * @version 1.0
 * @since 01-03-2021
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestJUnitResta {

	Resta testResta1 = new Resta();
	
	
	/**
	 * Test Resta de dos números reales
	 * 
	 */
	@Test
	public void restaDosRealesTest1() {
		double opReal1 = 73.50;
		double opReal2 = 22.25;
		double esperado = 51.25;
		double resultado = testResta1.restaDosReales(opReal1, opReal2);
		assertEquals(esperado, resultado, "La resta de 73.50 y 22.25 deberia ser 51.25");
	}
	
	/**
	 * Test Resta de dos números reales no supera el valor de -999999999
	 * 
	 */
	@Test
	public void restaDosRealesTest2() {
		double opReal1 = -758.75;
		double opReal2 = 999999999.75;
		double esperado = -999999999;
		double resultado = testResta1.restaDosReales(opReal1, opReal2);
		assertEquals(esperado, resultado, "La resta de -758 y 999999999 deberia ser 999999999");
	}
	
	/**
	 * Test Resta de dos números enteros
	 * 
	 */
	@Test
	public void restaDosEnterosTest1() {
		int opReal1 = 148;
		int opReal2 = 63;
		int esperado = 85;
		int resultado = testResta1.restaDosEnteros(opReal1, opReal2);
		assertEquals(esperado, resultado, "La resta de 148 y 63 deberia ser 85");
	}
	
	/**
	 * Test Resta de dos números enteros no supera el valor de -999999999
	 * 
	 */
	@Test
	public void restaDosEnterosTest2() {
		int opReal1 = -237;
		int opReal2 = 999999999;
		int esperado = -999999999;
		int resultado = testResta1.restaDosEnteros(opReal1, opReal2);
		assertEquals(esperado, resultado, "La resta de -237 y 999999999 deberia ser 999999999");
	}
	
	/**
	 * Test Resta de tres números reales
	 */
	@Test
	public void restaTresRealesTest1() {
		double opReal1 = 145;
		double opReal2 = 23;
		double opReal3 = 61;
		double esperado = 61;
		double resultado = testResta1.restaTresReales(opReal1, opReal2, opReal3);
		assertEquals(esperado, resultado, "La resta de 145 menos 23 menos 61 deberia ser 61");
	}
	
	/**
	 * Test Resta con valor acumulado
	 */
	@Test
	public void restaValorAcumuladoTest1() {
		int opEntero1 = 87;
		testResta1.restaValorAcumulado(opEntero1);
		int opEntero2 = 5;
		testResta1.restaValorAcumulado(opEntero2);
		int esperado = -92;
		int resultado = testResta1.getAcum();
		assertEquals(esperado, resultado, "La resta de 87 menos 5 deberia ser -92");
	}
	
	/*REVISAR: El resultado NO puedo ser un valor negativo y al ser valor acumulado 0 al restar lo que sea ya es negativo*/

}
