import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int distancia = input.nextInt();
		
		int tempo_total = distancia*2;
		
		System.out.println(tempo_total + " minutos");

		input.close();
	}
}