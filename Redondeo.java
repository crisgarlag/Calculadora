import java.math.BigDecimal;
import java.math.RoundingMode;

public class Redondeo {

	public static void main(String[] args) {
	
	     System.out.println(redondearDecimales(75.41565846464864, 2));
        
        }
	 public static double redondearDecimales(double valorInicial, int numeroDecimales) {
	        double parteEntera, resultado;
	        resultado=valorInicial;
	        parteEntera= Math.floor(resultado);
	        resultado= (resultado-parteEntera)* Math.pow(10, numeroDecimales);
	        resultado= Math.round(resultado);
	        resultado= (resultado/Math.pow(10, numeroDecimales))+parteEntera;
	        return resultado;
	    }
}
