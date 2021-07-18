import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
	
		Scanner input = new Scanner(System.in);
				
		double[] number = new double[6];
		int pos = 0;
		double soma_pos = 0;
		
		for(int i = 0; i < 6; i++) {
			number[i] = input.nextDouble();
			if(number[i]>0) {
				pos++;
				soma_pos += number[i];
			}
		}
		
		System.out.println(pos + " valores positivos");
		System.out.printf("%.1f\n", soma_pos/pos);

		input.close();		
	}
}