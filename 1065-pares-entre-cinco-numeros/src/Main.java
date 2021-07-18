import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
	
		Scanner input = new Scanner(System.in);
				
		int[] numbers = new int[5];
		int par = 0;
				
		for(int i = 0; i < 5; i++) {
			numbers[i] = input.nextInt();
			if(numbers[i]%2==0)
				par++;
		}
		
		System.out.println(par + " valores pares");
		
		input.close();		
	}
}