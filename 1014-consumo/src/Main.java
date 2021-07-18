import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int distancia = input.nextInt();
		double litros = input.nextDouble();

		double consumo = distancia/litros;
		
		System.out.printf("%.3f km/l%n", consumo);

		input.close();
	}
}