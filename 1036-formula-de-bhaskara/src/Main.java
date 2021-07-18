import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double delta = (b*b) - (4*a*c);
		
		if ((2*a == 0) || (delta < 0)) {
			System.out.println("Impossivel calcular");
		}
		
		else {
			double raiz1 = ((-1*b) + Math.sqrt(delta))/(2*a);
			double raiz2 = ((-1*b) - Math.sqrt(delta))/(2*a);
			
			System.out.print("R1 = ");
			System.out.printf("%.5f", raiz1);
			System.out.print("\nR2 = ");
			System.out.printf("%.5f", raiz2);
			System.out.print("\n");
		}		
		
		input.close();
	}
}