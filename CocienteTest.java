/**
 * Pruebas clase Cociente
 * @author beina
 * @version 1.0
 * @desde 01-03-21
 * 
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CocienteTest {

	Cociente cociente = new Cociente();
	
	@Test
	public void testCociente() {
		double resultado = cociente.division(10.5, 3.0);
		double esperado = 4; 
		assertEquals (esperado,resultado);
	}
	
	@Test
	public void testDivision () {
		double resultado = cociente.division(8, 2);
		double esperado = 4.0; 
		assertEquals (esperado, resultado);
	}
	
	
	@Test
	public void inverso() {
		double resultado = cociente.inverso(4);
		double esperado = 0.25;
		assertEquals (esperado, resultado);
	
	}
	
	
	@Test
	public void raizCuadrada () {
		double resultado = cociente.raizCuadrada(0);
		double esperado = 1;
		assertEquals (esperado, resultado);
	}
	
	
}
