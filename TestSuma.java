
public class TestSuma {

	public static void main(String[] args) {
		Suma test1 = new Suma(25, 75, 96, 45.85, 96.05, 68.25, 33, 62.07, 20);
		
		System.out.println(test1.sumaDosReales(test1.getOperandoReal1(), test1.getOperandoReal2()));
		System.out.println(test1.sumaDosEnteros(test1.getOperandoEntero1(), test1.getOperandoEntero2()));
		System.out.println(test1.sumaTresReales(test1.getOperandoReal1(), test1.getOperandoReal2(), test1.getOperandoReal3()));
		System.out.println(test1.sumaValorAcumulado(test1.getOperandoEntero1()));
	}

}
