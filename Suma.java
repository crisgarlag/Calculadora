/**
 * Esta clase implementa todos los m�todos que est�n relacionados con la suma.
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
	 * Suma de dos n�meros reales
	 * @param operandoReal1 N�mero real, par�metro de entrada, no negativo
	 * @param operandoReal2 N�mero real, par�metro de entrada, no negativo
	 * @return solucionReal N�mero real, par�metro de salida. Soluci�n a la suma de los dos par�metros de entrada
	 */
	public double sumaDosReales(double operandoReal1, double operandoReal2) {
		this.solucionReal = operandoReal1 + operandoReal2;
		return solucionReal;
	}
	
	
	/**
	 * Suma de dos n�meros enteros
	 * @param operandoEntero1 N�mero entero, par�metro de entrada, no negativo
	 * @param operandoEntero2 N�mero entero, par�metro de entrada, no negativo
	 * @return solucionEntero N�mero entero, par�metro de salida. Soluci�n a la suma de los dos par�metros de entrada
	 */
	public int sumaDosEnteros(int operandoEntero1, int operandoEntero2) {
		this.solucionEntero = operandoEntero1 + operandoEntero2;
		return solucionEntero;
	} 

}
