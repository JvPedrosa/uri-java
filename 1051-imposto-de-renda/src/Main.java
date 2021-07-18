import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double salario = input.nextDouble();
		
		if(salario >= 0 && salario <= 2000) {
			System.out.println("Isento");
		}
		
		else if(salario > 2000 && salario <= 3000) {
			System.out.printf("R$ %.2f\n", (salario-2000)*0.08);
		}
		
		else if(salario > 3000 && salario <= 4500) {
			System.out.printf("R$ %.2f\n", 1000*0.08 + (salario-3000)*0.18);
		}
		
		else {
			System.out.printf ( "R$ %.2f\n", 1000*0.08 + 1500*0.18 + (salario-4500)*0.28 );
		}		
				
		input.close();
	}
}