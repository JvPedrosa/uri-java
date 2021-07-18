import java.util.Scanner;
import java.util.Locale;

public class Main {	
	// 5% wrong answer
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		
		double media = (a*2 + b*3 + c*4 + d)/10;
		
		System.out.printf("Media: %.1f%n", media);
		
		if(media >= 7.0) {
	          System.out.printf("Aluno aprovado.\n");
		}
		
		else if(media < 7.0 && media >= 5.0) {
	          System.out.printf("Aluno em exame.\n");
			double exame = input.nextDouble();
	          System.out.printf("Nota do exame: %.1f\n", exame);
			
			double mediafinal = (media+exame)/2.0;
			
			if(mediafinal >= 5.0) {
	            System.out.println("Aluno aprovado.");
			}
			
			else {
	            System.out.println("Aluno reprovado.");
			}
			
	        System.out.printf("Media final: %.1f\n", mediafinal);
		}
		
		else {
			System.out.println("Aluno reprovado.");
		}
		
		
		input.close();
	}
}