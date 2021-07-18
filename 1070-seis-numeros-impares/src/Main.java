import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
	
		Scanner input = new Scanner(System.in);
				
		int x = input.nextInt();
		
		for (int i = x; i < x+12; i++) {
			if(i%2!=0)
				System.out.println(i);
		}
		
		input.close();		
	}
}