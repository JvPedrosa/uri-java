import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int anos = n/365;		
		int meses = (n%365)/30;
		int dias = (n%365)%30;
		
		System.out.printf(anos + " ano(s)%n"+ meses + " mes(es)%n" + dias + " dia(s)%n");		

		input.close();
	}
}