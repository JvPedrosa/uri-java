import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		
		palavra1 = input.next();
		palavra2 = input.next();
		palavra3 = input.next();
		
		if("vertebrado".equals(palavra1)){
            
			if("ave".equals(palavra2)){
                
            	if("carnivoro".equals(palavra3)){
                    System.out.print("aguia\n");
                }
                
                else {
                	System.out.print("pomba\n");
                }
            }
            
            else{
            	
            	if("onivoro".equals(palavra3)){
            		System.out.print("homem\n");
            	}
            	
            	else {
            		System.out.print("vaca\n");
            	}
            }
        }
		
		else {
            
			if("inseto".equals(palavra2)){
                
				if("hematofago".equals(palavra3)){
                    System.out.print("pulga\n");
                }
				
				else {
                    System.out.print("lagarta\n");
                }
            }
			
			else {
				
                if("hematofago".equals(palavra3)){
                    System.out.print("sanguessuga\n");
                }
                
                else {
                    System.out.print("minhoca\n");
                }
            }
		}
		
		input.close();
	}
}