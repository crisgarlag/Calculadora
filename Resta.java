/**
 * 
 * @author Sarah Amselem
 * @version 1.0
 * @since 21/02/21
 * @see Resta
 *
 *La clase contiene métodos para ejecutar operaciones de sustracción entre distintos parámetros. Esta clase forma parte de una 
 *calculadora. 
 */

public class Resta {
	
	private int opEntero1;
	private int opEntero2;
	private int opEntero3;
	private double opReal1;
	private double opReal2;
	private double opReal3;
	
	private int solEntero;
	private double solReal;
	
	private int acum = 0;
	

	
	public Resta(int opEntero1, int opEntero2, int opEntero3, double opReal1, double opReal2, double opReal3,
			int solEntero, double solReal, int acum) {
		super();
		this.opEntero1 = opEntero1;
		this.opEntero2 = opEntero2;
		this.opEntero3 = opEntero3;
		this.opReal1 = opReal1;
		this.opReal2 = opReal2;
		this.opReal3 = opReal3;
		this.solEntero = solEntero;
		this.solReal = solReal;
		this.acum = acum;
	}


	/**
	 * Resta de dos números reales
	 * @see Resta
	 *@param  opReal1 y opReal2 son parámetros de entrada, reales y no negativo
	 *@return solReal es la solución a la resta de los dos parámetros de entrada. Ha de ser real. 
	 */

	public double restaDosReales(double opReal1, double opReal2) {
		this.solReal = opReal1 - opReal2;
		return solReal;
	}
}