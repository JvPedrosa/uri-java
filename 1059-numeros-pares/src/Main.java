//import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
				
		for(int par = 1; par <= 100; par++) {
			if(par%2==0) {
				System.out.println(par);
			}
		}				
	}
}