import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double salario = input.nextDouble();
		
		if(salario <= 400){			
			double novoSalario = salario + (salario * 0.15);
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
			System.out.printf("Em percentual: 15 %%\n");
		}
		
		else if((salario > 400) && (salario <= 800)){
			double novoSalario = salario + (salario * 0.12);
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
			System.out.printf("Em percentual: 12 %%\n");			
		}
		
		else if((salario > 800) && (salario <= 1200)){
			double novoSalario = salario + (salario * 0.10);
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
			System.out.printf("Em percentual: 10 %%\n");			
		}
		
		else if((salario > 1200) && (salario <= 2000)){
			double novoSalario = salario + (salario * 0.07);
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
			System.out.printf("Em percentual: 7 %%\n");			
		}
		
		else{
			double novoSalario = salario + (salario * 0.04);
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
			System.out.printf("Em percentual: 4 %%\n");			
		}
		
		input.close();
	}
}