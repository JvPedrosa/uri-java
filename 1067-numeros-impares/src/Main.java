import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
	
		Scanner input = new Scanner(System.in);
				
		short x = input.nextShort();
		
		for (int i = 1; i <= x; i++) {
			if(i%2!=0)
				System.out.println(i);
		}
		
		input.close();		
	}
}