import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
/**
 * Clase para testear los metodos de la clase Suma
 * @author cristiangarcialagar
 *
 */
public class SumaTest {
	
	Suma cut= new Suma();
	
	/**
	 * para probar que el metodo sumaDosReales suma correctamente
	 */
	@Test
	public void sumaCienyCincuetaDebeSerCientoCincuentaReal() {
		double sumando1=100.00;
		double sumando2=50;
		double esperado=150;
		double resultado= cut.sumaDosReales(sumando1,sumando2);
		assertEquals(esperado, resultado, "La suma de 100.00 y 50.00 debe ser 150.00");
	}
	
	
	/**
	 * para probar que la suma de dos reales no puede superar 999999999
	 */
	@Test
	public void laSumaNoPuedeSuperar999999999Reales() {
		double sumando1=999999999.00;
		double sumando2=100000.00;
		double esperado=999999999.00;
		double resultado= cut.sumaDosReales(sumando1,sumando2);
		assertEquals(esperado, resultado, "La suma de dos numeros reales no puede superar 999999999.00");
	}
		
	
	/**
	 * para probar que el metodo sumaDosEnteros suma correctamente
	 */
	@Test
	public void sumaCienyCincuetaDebeSerCientoCincuentaEntero() {
		int sumando1=100;
		int sumando2=50;
		int esperado=150;
		int resultado= cut.sumaDosEnteros(sumando1,sumando2);
		assertEquals(esperado, resultado, "La suma de 100 y 50 debe ser 150");
	}
	
	/**
	 * para probar que la suma de dos reales no puede superar 999999999
	 */
	@Test
	public void laSumaNoPuedeSuperar999999999Enteros() {
		int sumando1=999999999;
		int sumando2=100000;
		int esperado=999999999;
		int resultado= cut.sumaDosEnteros(sumando1,sumando2);
		assertEquals(esperado, resultado, "La suma de dos numeros enteros no puede superar 999999999");
	}
	
	/**
	 * para probar que el metodo sumaTresReales suma correctamente
	 */
	@Test
	public void elSumadetreintaVeinteyMenosDiezEsCuarenta() {
		double sumando1=30.00;
		double sumando2=20.00;
		Float sumando3=-10F;
		double esperado=40.00;
		double resultado= cut.sumaTresReales(sumando1,sumando2,sumando3);
		assertEquals(esperado, resultado, "La suma de tres numeros Reales no puede superar 999999999");
	}
	
	/**
	 * para probar que la suma de tres reales no puede superar 999999999
	 */
	@Test
	public void elSumadeTresRealesNoPuedeSuperar999999999() {
		double sumando1=999999999;
		double sumando2=100000;
		Float sumando3=10F;
		double esperado=999999999;
		double resultado= cut.sumaTresReales(sumando1,sumando2,sumando3);
		assertEquals(esperado, resultado, "La suma de tres numeros Reales no puede superar 999999999");
	}
	
	/**
	 *  para probar que la suma del valor acumulado no puede superar 999999999
	 */
	@Test
	public void elSumadeAcumuladaNoPuedeSuperar999999999() {
		int sumando1=999999999;
		cut.sumaValorAcumulado(sumando1);
		int sumando2=996594999;
		cut.sumaValorAcumulado(sumando2);
		int esperado=999999999;
		int resultado= cut.getValorAcumulado();
		assertEquals(esperado, resultado, "El valor acumulado no puede superar 999999999");
	}

}
