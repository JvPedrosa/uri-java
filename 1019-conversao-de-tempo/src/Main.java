import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int horas = n/3600;
		int min = (n%3600)/60;
		int seg = n%60;
		
		System.out.println(horas + ":" + min + ":" + seg);		

		input.close();
	}
}