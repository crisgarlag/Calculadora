/**
 * Con esta clase podemos ejecutar todos los metodos relacionados con producto.
 * @author beina 
 * @version 1.0
 * @since 21-02-2021
 * 
 */

public class Producto {
	

	/**
	 * Declaramos parametros.
	 */

	private int operandoEntero1;
	private int operandoEntero2;
	private double operandoReal1;
	private double operandoReal2;
	private double operandoReal3;
	
	private int solucionEntero;
	private static double solucionReal;
	
	
	
	/**
	 * Se genera el contructor vacio.
	 */
	
	public Producto() {

	}
	
	//Constructor 
	public Producto(int operandoEntero1, int operandoEntero2, double operandoReal1, double operandoReal2,
			double operandoReal3, int solucionEntero, double solucionReal) {
		super();
		this.operandoEntero1 = operandoEntero1;
		this.operandoEntero2 = operandoEntero2;
		this.operandoReal1 = operandoReal1;
		this.operandoReal2 = operandoReal2;
		this.operandoReal3 = operandoReal3;
		this.solucionEntero = solucionEntero;
		this.solucionReal = solucionReal;
	}




	 /** Se generan los getter and setter.
	 * @return
	 */


	public int getOperandoEntero1() {
		return operandoEntero1;
	}


	public void setOperandoEntero1(int operandoEntero1) {
		this.operandoEntero1 = operandoEntero1;
	}


	public int getOperandoEntero2() {
		return operandoEntero2;
	}


	public void setOperandoEntero2(int operandoEntero2) {
		this.operandoEntero2 = operandoEntero2;
	}


	public double getOperandoReal1() {
		return operandoReal1;
	}


	public void setOperandoReal1(double operandoReal1) {
		this.operandoReal1 = operandoReal1;
	}


	public double getOperandoReal2() {
		return operandoReal2;
	}


	public void setOperandoReal2(double operandoReal2) {
		this.operandoReal2 = operandoReal2;
	}


	public double getOperandoReal3() {
		return operandoReal3;
	}


	public void setOperandoReal3(double operandoReal3) {
		this.operandoReal3 = operandoReal3;
	}


	public int getSolucionEntero() {
		return solucionEntero;
	}


	public void setSolucionEntero(int solucionEntero) {
		this.solucionEntero = solucionEntero;
	}


	public double getSolucionReal() {
		return solucionReal;
	}


	public void setSolucionReal(double solucionReal) {
		
		this.solucionReal = solucionReal;
	}



	/**
	 * LOS METODOS DE LA CLASE 
	 */

	/**
	 * Producto de dos numeros reales
	 * @param operandoReal1 operando real, parametro de entrada,
	 * @param operandoReal2 operando real, parametro de entrada,
	 * @return solucionReal operando real, parametro de salida, solucion al producto de los dos parametros de entrada.
	 */
	
	public double productoDosReales (double _operandoReal1, double _operandoReal2) {
		double solucionReal = _operandoReal1 * _operandoReal2;
		
		
	/**
	 * El resultado no podrá ser un valor mayor de 999999999
	 */
		if (solucionReal < 999999999) {
			return solucionReal;
		} else {
			return 999999999;
		}
		
	}
	
	

	/**
	 * Producto de dos numeros enteros
	 * @param operandoEntero1 operando entero, parametro de entrada,
	 * @param operandoEntero2 operando entero, parametro de entrada,
	 * @return solucionEntero operando entero, parametro de salida, solucion al producto de los dos parametros de entrada.
	 */
	
	public int productoDosEnteros (int _operandoEntero1, int _operandoEntero2) {
		int solucionEntero = _operandoEntero1 * _operandoEntero2;
		
	/**
	 * El resultado no podrá ser un valor mayor de 999999999
	 */
		if (solucionEntero < 999999999) {
			return solucionEntero;
		} else {
			return 999999999;
		}
	}
	
	
	
	/**
	 * Producto de tres numeros reales
	 * @param operandoReal1 operando real, parametro de entrada,
	 * @param operandoReal2 operando real, parametro de entrada,
	 * @param operandoReal3 operando real, parametro de entrada,
	 * @return solucionReal operando real, parametro de salida, solucion al producto de los dos parametros de entrada.
	 */
	
	public double productoTresReales (double _operandoReal1, double _operandoReal2, double _operandoReal3) {
		double solucionReal = _operandoReal1 * _operandoReal2 * _operandoReal3;
	
	/**
	 * El resultado no podrá ser un valor mayor de 999999999
	 */
		if (solucionReal < 999999999) {
			return solucionReal;
		} else {
			return 999999999;
		}
	
	}
	

	/**
	 * Potencia de un numero entero
	 * @param operandoEntero1 operando entero, parametro de entrada,
	 * @param operandoEntero2 operando entero, parametro de entrada,
	 * @return solucionEntero operando entero, parametro de salida, solucion de la potencia de base y exponente de los dos parametros de entrada.
	 */
	
	public double potencia (double base, double exp) {
		double solucionReal = Math.pow(base,exp);
		
	
	/**
	 * En el caso de que el exponente sea mayor que 5 el resultado será 0.
	 */
		if  (exp <= 5) {
			return solucionReal;
		} else {
			return 0;
		}
		
	}
	
			
	
}
	