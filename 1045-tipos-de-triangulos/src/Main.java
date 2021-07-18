import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		double lados[] = new double[3];
		
		lados[0] = input.nextDouble();
		lados[1] = input.nextDouble();		
		lados[2] = input.nextDouble();		

		Arrays.sort(lados);

		c = lados[0];
		b = lados[1];
		a = lados[2];
		
		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		
		else {
			if ((a*a) == ((b*b) + (c*c))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			
			if ((a*a) > ((b*b) + (c*c))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			
			if ((a*a) < ((b*b) + (c*c))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if ((a == b) && (a == c)) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			
			if ((a == b) && (b != c) || ((a != b)) && (b == c)) {
				System.out.println("TRIANGULO ISOSCELES");
			}	
		}		
		
		input.close();
	}
}