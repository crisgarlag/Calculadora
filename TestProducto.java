package Calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class TestProducto {

	Producto producto = new Producto();
	
	@Test
	public void testPotencia() {
		double resultado = producto.potencia(2, 2);
		double esperado = 4; 
		 assertEquals(esperado, resultado);
	}
	@Test
	public void testProductoTresReales() {
		double resultado = producto.productoTresReales(5, 6, 2);
		double esperado = 60;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testProductoDosReales() {
		double resultado = producto.productoDosReales(1.5, 2);
		double esperado = 3;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testProductoDosEnteros() {
		int resultado = producto.productoDosEnteros(5, 5);
		int esperado = 25;
		assertEquals(esperado, resultado);
	}
}