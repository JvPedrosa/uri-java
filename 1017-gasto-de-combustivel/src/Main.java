import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int tempo = input.nextInt();
		int velocidade = input.nextInt();

		int distancia = velocidade * tempo;
		
		double litros = distancia/12.0;
		
		System.out.printf("%.3f%n", litros);

		input.close();
	}
}