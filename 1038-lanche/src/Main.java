import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int codigo = input.nextInt();
		int quantidade = input.nextInt();
		
		double total = 0;
		
		if (codigo == 1) {
			total = 4.0 * quantidade;
		}
		
		else if (codigo == 2) {
			total = 4.5 * quantidade;
		}
		
		else if (codigo == 3) {
			total = 5.0 * quantidade;
		}
		
		else if (codigo == 4) {
			total = 2.0 * quantidade;
		}
		
		else if (codigo == 5) {
			total = 1.5 * quantidade;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);			
		
		input.close();
	}
}