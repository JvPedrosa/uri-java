import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		
		double media = (A*3.5 + B*7.5)/11;
		
		System.out.printf("MEDIA = %.5f%n", media);		
	}
}