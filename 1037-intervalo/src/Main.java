import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		
		if (a < 0 || a > 100) {
			System.out.printf("Fora de intervalo%n");
		}
		
		else if (a >= 0 && a <= 25) {
			System.out.printf("Intervalo [0,25]%n");
		}
		
		else if (a > 25 && a <= 50) {
			System.out.printf("Intervalo (25,50]%n");
		}
		
		else if (a > 50 && a <= 75) {
			System.out.printf("Intervalo (50,75]%n");
		}
		
		else {
			System.out.printf("Intervalo (75,100]%n");
		}
		
		input.close();
	}
}