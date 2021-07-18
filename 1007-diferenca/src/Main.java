import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();
		
		int diferenca = (A*B)-(C*D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		input.close();
	}
}