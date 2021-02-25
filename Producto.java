

/**
 * Con esta clase podemos ejecutar todos los metodos relacionados con producto.
 * @author beina 
 * @version 1.0
 * @since 21-02-2021
 * 
 */

public class Producto {
		
		private int operandoEntero1;
		private int operandoEntero2;
		private double operandoReal1;
		private double operandoReal2;
		private double operandoReal3;
		
		private int solucionEntero;
		private double solucionReal;
		
		private int valorAcumulado = 0;
		
		/**
		 * Producto de dos numeros reales
		 * @param operandoReal1 operando real, parametro de entrada,
		 * @param operandoReal2 operando real, parametro de entrada,
		 * @return solucionReal operando real, parametro de salida, solucion al producto de los dos parametros de entrada.
		 */
		
		public double productoDosReales (double _operandoReal1, double _operandoReal2) {
			double solucionReal = _operandoReal1 * _operandoReal2;
			return solucionReal;
		}
	
		
		/**
		 * Producto de dos numeros enteros
		 * @param operandoEntero1 operando entero, parametro de entrada,
		 * @param operandoEntero2 operando entero, parametro de entrada,
		 * @return solucionEntero operando entero, parametro de salida, solucion al producto de los dos parametros de entrada.
		 */
		
		public int productoDosEnteros (int _operandoEntero1, int _operandoEntero2) {
			int solucionEntero = _operandoEntero1 * _operandoEntero2;
			return solucionEntero;
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
			return solucionReal;
		}

		/**
		 * Potencia de un numero entero
		 * @param operandoEntero1 operando entero, parametro de entrada,
		 * @param operandoEntero2 operando entero, parametro de entrada,
		 * @return solucionEntero operando entero, parametro de salida, solucion de la potencia de base y exponente de los dos parametros de entrada.
		 */
		
		public double potencia (double base, double exp) {
			double solucionReal = Math.pow(base,exp);
			return solucionReal;
		}
		

}


