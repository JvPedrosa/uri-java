import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int horas = input.nextInt();		
		double valor = input.nextDouble();
				
		System.out.println("NUMBER = " + number);
		
		double salary = horas * valor;
		
		System.out.printf("SALARY = U$ %.2f%n", salary);		
		
		input.close();
	}
}