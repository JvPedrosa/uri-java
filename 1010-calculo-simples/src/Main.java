import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int peca1 = input.nextInt();
		int numero1 = input.nextInt();
		double valor1 = input.nextDouble();
		
		int peca2 = input.nextInt();
		int numero2 = input.nextInt();
		double valor2 = input.nextDouble();
		
		double total = (numero1*valor1) + (numero2*valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		input.close();
	}
}