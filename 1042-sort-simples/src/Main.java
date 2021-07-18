import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b && a > c && b > c) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a + "\n");
		}
		
		else if (a > b && a > c && b < c) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a + "\n");
		}
		
		else if (b > a && b > c && a > c) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b + "\n");
		}
		
		else if (b > a && b > c && a < c) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b + "\n");
		}
		
		else if (c > a && c > b && b > a) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c + "\n");
		}
		
		else if (c > a && c > b && b < a) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c + "\n");
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		input.close();
	}
}