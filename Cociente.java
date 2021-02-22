/**
 * 	La clase Cociente contiene metodos para realizar operaciones de division en una calculadora.
 * 	
 * 	
 * @author Cristian Garcia Lagar
 * @since 22/01/2020
 * @version 1.0
 */
public class Cociente {
	
	private double numReal1, numReal2;
	private int numInt1, numInt2;
	
	/**
	 * Constructor con los dos parametros double
	 * @param numReal1
	 * @param numReal2
	 */
	public Cociente(double numReal1, double numReal2) {
		super();
		this.numReal1=numReal1;
		this.numReal2=numReal2;
	}

	/**
	 *  Constructor con los dos parametros enteros
	 * @param numInt1
	 * @param numInt2
	 */
	public Cociente(int numInt1, int numInt2) {
		super();
		this.numInt1 = numInt1;
		this.numInt2 = numInt2;
	}
	
	

	/**
	 * Constructor sin parametros
	 */
	public Cociente() {
		super();
	}
	
	/**
	 * Permite obtener el valor de la propiedad numReal1 
	 *
	 * @return valor de la propiedad numReal1
	 */

	public double getNumReal1() {
		return numReal1;
	}
	/**
	 *  Modifica el valor de la propiedad numReal1
	 * @param numReal1
	 */
	public void setNumReal1(double numReal1) {
		this.numReal1 = numReal1;
	}
	/**
	 *  Permite obtener el valor de la propiedad numReal2
	 * @returnde valor de la propiedad numReal2
	 */

	public double getNumReal2() {
		return numReal2;
	}
	/**
	 * Modifica el valor de la propiedad numReal2
	 * @param numReal2
	 */
	public void setNumReal2(double numReal2) {
		this.numReal2 = numReal2;
	}
	/**
	 *  Permite obtener el valor de la propiedad numInt1
	 * @return valor de la propiedad numInt1
	 */
	public int getNumInt1() {
		return numInt1;
	}
	/**
	 * Modifica el valor de la propiedad numInt1
	 * @param numInt1
	 */
	public void setNumInt1(int numInt1) {
		this.numInt1 = numInt1;
	}
	/**
	 *  Permite obtener el valor de la propiedad numInt2
	 * @return valor de la propiedad numInt2
	 */
	public int getNumInt2() {
		return numInt2;
	}

	/**
	 * Modifica el valor de la propiedad numInt2
	 * @param numInt2
	 */
	public void setNumInt2(int numInt2) {
		this.numInt2 = numInt2;
	}

	/**
	 * El metodo devuelve el resultado de la division entre dos numeros reales.
	 *
	 * Casos especiales:
	 * El resultado se redondeará al valor mas cercano.
	 * Si es parametro numReal2 es igual a 0, devuelve NaN
	 * 
	 * 
	 * @param numReal1 es el dividendo de la operacion matematica.
	 * @param numReal2 es el divisor de la operacion matematica.
	 * @return devuelve el resultado de una division.
	 */
	public double division(double numReal1, double numReal2) {
		if(numReal2==0)
			return Double.NaN;
		else
		return Math.round(numReal1/numReal2);
	}
	
	/**
	 * El metodo devuelve el resultado de la division entre dos numeros enteros.
	 * 
	 Casos especiales:
	 * El resultado se redondeará al valor mas cercano.
	 * Si es parametro numReal2 es igual a 0, devuelve NaN
	 * 
	 * @param numInt1 es el dividendo de la operacion matematica.
	 * @param numInt2 es el divisor de la operacion matematica.
	 * @return el resultado de la division.
	 */
	public double division(int numInt1, int numInt2) {
		double division= (double) numInt1/numInt2;
		if(numInt2==0)
			return Double.NaN;
		else
		return Math.round(division);
	}
	/**
	 * El metodo devuelve el inverso de un numero real.
	 *  
	 * @param numReal1 valor sobre el que se calculara el invero.
	 * @return el numero inverso.
	 */
	public double inverso(double numReal1) {
		return 1/numReal1;
	}
	/**
	 * El metodo devuelve la raiz cuadrada del parametro.
	 * Caso especial:
	 * Si el parametro numInt1 es menor que 0, devuelve el infinito negativo.
	 * Si el parametro numint es igual a 0, devuelve 1
	 *   
	 * @param numInt1 valor sobre el que se calculara la raiz cuadrada.
	 * @return la raiz cuadrada.
	 */
	public double raizCuadrada(int numInt1) {
		if(numInt1<0)
			return Double.NEGATIVE_INFINITY;
		else if (numInt1==0)
			return 1.0;
		else
		return Math.sqrt(numInt1);
	}
}
