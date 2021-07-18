import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
	
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[6];
		int num_pos = 0;
		
		for(int i=0; i < 6; i++) {
			number[i] = input.nextDouble();
			if(number[i] > 0)
				num_pos++;
		}
		
		System.out.println(num_pos + " valores positivos");
		
		input.close();		
	}
}