import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
	
		Scanner input = new Scanner(System.in);
				
		int[] numbers = new int[5];
		int par = 0, impar = 0, pos = 0, neg = 0;
				
		for(int i = 0; i < 5; i++) {
			numbers[i] = input.nextInt();
			if (numbers[i]%2==0)
				par++;
			else
				impar++;
			if (numbers[i]>0)
				pos++;
			if (numbers[i]<0)
				neg++;
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
		
		input.close();		
	}
}