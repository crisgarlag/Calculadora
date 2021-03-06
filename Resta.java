	/**
	 * 
	 * @author Sarah Amselem
	 * @version 1.0
	 * @since 01/03/21
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
		
	/**
	 * Constructor con todos los parámetros
	 * 
	 * 	@param opEntero1
	 *  @param opEntero2
	 *  @param opEntero3
	 *  @param opReal1
	 *  @param opReal2
	 *  @param opReal3
	 *  
	 *  @param solEntero
	 *  @param solReal
	 *  
	 *  @param acum
	 * 
	 */
		
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


		/**MÉTODOS
		 * 
		 * 
		 * La solución nunca podrá ser inferior a -999999999
		 */
		  
		 
		/** 
		 * Resta de dos números reales
		 * @see Resta
		 *@param  opReal1 y opReal2 son parámetros de entrada, reales y no negativo
		 *@return solReal es la solución a la resta de los dos parámetros de entrada. Ha de ser real. 
		 */

		public double restaDosReales(double opReal1, double opReal2) {
			this.solReal = opReal1 - opReal2;
			if (solReal < -999999999) {
				return solReal;
			} else {
				return -999999999;
			}
			
		}
		/**
		 * Resta de dos números enteros
		 * @see Resta
		 * @param opEntero1 y opEntero2 son parámetros de entrada, enteros y no negativo
		 * @return solEntero es la solución a la resta de los dos parámetros de entrada. Ha de ser entero. 
		 */
		public int restaDosEnteros(int opEntero1, int opEntero2) {
			this.solEntero = opEntero1 - opEntero2;
			if (solEntero < -999999999) {
				return solEntero;
			} else {
				return -999999999;
			}		
		} 
		/**
		 * Resta de tres números reales
		 * @see Resta
		 * @param opEntero1, opEntero2 y opEntero3 son parámetros de entrada, enteros y no negativo
		 * @return solReal es la solución a la resta de los dos parámetros de entrada. Ha de ser entero. 
		 */
		public double restaTresReales(double opReal1, double opReal2, double opReal3) {
			this.solReal = opReal1 - opReal2 - opReal3;
			if (solReal < 999999999) {
				return solReal;
			} else {
				return -999999999;
		    }
		}
		/**
		 * Resta con valor acumulado
		 * @see Resta
		 * @param El parámetro no puede ser negativo 
		 */
		public void restaValorAcumulado(int opEntero1) {
			this.acum -= opEntero1;
			if (this.acum < -999999999) {
				this.acum = 999999999;
		}
		
		/*
		 * Setters y getters
		 */
			
			
			
			
			
	}


		public int getOpEntero1() {
			return opEntero1;
		}


		public void setOpEntero1(int opEntero1) {
			this.opEntero1 = opEntero1;
		}


		public int getOpEntero2() {
			return opEntero2;
		}


		public void setOpEntero2(int opEntero2) {
			this.opEntero2 = opEntero2;
		}


		public int getOpEntero3() {
			return opEntero3;
		}


		public void setOpEntero3(int opEntero3) {
			this.opEntero3 = opEntero3;
		}


		public double getOpReal1() {
			return opReal1;
		}


		public void setOpReal1(double opReal1) {
			this.opReal1 = opReal1;
		}


		public double getOpReal2() {
			return opReal2;
		}


		public void setOpReal2(double opReal2) {
			this.opReal2 = opReal2;
		}


		public double getOpReal3() {
			return opReal3;
		}


		public void setOpReal3(double opReal3) {
			this.opReal3 = opReal3;
		}


		public int getSolEntero() {
			return solEntero;
		}


		public void setSolEntero(int solEntero) {
			this.solEntero = solEntero;
		}


		public double getSolReal() {
			return solReal;
		}


		public void setSolReal(double solReal) {
			this.solReal = solReal;
		}


		public int getAcum() {
			return acum;
		}


		public void setAcum(int acum) {
			this.acum = acum;
		}
}
