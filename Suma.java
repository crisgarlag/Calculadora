/**
 * Esta clase implementa todos los métodos que están relacionados con la suma.
 * @author Alberto
 * @version 1.0
 * @since 14-01-2021
 *
 */

public class Suma {
	
	private int operandoEntero1;
	private int operandoEntero2;
	private int operandoEntero3;
	private double operandoReal1;
	private double operandoReal2;
	private double operandoReal3;
	
	private int solucionEntero;
	private double solucionReal;
	
	private int valorAcumulado = 0;
	
	/**
	 * Suma de dos números reales
	 * @param operandoReal1 Número real, parámetro de entrada, no negativo
	 * @param operandoReal2 Número real, parámetro de entrada, no negativo
	 * @return solucionReal Número real, parámetro de salida. Solución a la suma de los dos parámetros de entrada
	 */
	public double sumaDosReales(double operandoReal1, double operandoReal2) {
		this.solucionReal = operandoReal1 + operandoReal2;
		return solucionReal;
	}
	
	/**
	 * Suma de dos números enteros
	 * @param operandoEntero1 Número entero, parámetro de entrada, no negativo
	 * @param operandoEntero2 Número entero, parámetro de entrada, no negativo
	 * @return solucionEntero Número entero, parámetro de salida. Solución a la suma de los dos parámetros de entrada
	 */
	public int sumaDosEnteros(int operandoEntero1, int operandoEntero2) {
		this.solucionEntero = operandoEntero1 + operandoEntero2;
		return solucionEntero;
	} 
	
	/**
	 * Suma de tres números reales
	 * @param operandoReal1 Número real, parámetro de entrada, no negativo
	 * @param operandoReal2 Número real, parámetro de entrada, no negativo
	 * @param operandoReal3 Número real, parámetro de salida. Solución a la suma de los tres parámetros de entrada
	 * @return
	 */
	public double sumaTresReales(double operandoReal1, double operandoReal2, double operandoReal3) {
		this.solucionReal = operandoReal1 + operandoReal2 + operandoReal3;
		return solucionReal;
	}
	
	/**
	 * Suma con valor acumulado
	 * @param operandoEntero1, no negativo
	 */
	public void sumaValorAcumulado(int operandoEntero1) {
		this.valorAcumulado += operandoEntero1;
	}
	
	

}
