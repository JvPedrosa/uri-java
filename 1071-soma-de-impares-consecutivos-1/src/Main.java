import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	 public static int soma(int x, int y){
	        int soma = 0;
	        for(int i = (x+1); i<y; i++){
	            if(i%2 != 0){
	                soma += i;
	            }
	        }
	        return soma;
	    }
	 
	 public static void main(String[] args){
		 
		 Scanner input = new Scanner(System.in);
		 
	     int x = input.nextInt();
	     int y = input.nextInt();
	     
	     if(x > y){
	    	 System.out.println(soma(y, x));
	     }
	     
	     else {
	        System.out.println(soma(x, y));
	     }
	     
	     input.close();
	 }
}