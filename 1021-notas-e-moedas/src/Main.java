import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		double valor = input.nextDouble();
		
		int valorint = (int)valor;

		int notas100 = valorint/100;
		int resto100 = valorint%100;	
		
		int notas50 = resto100/50;
		int resto50 = resto100%50;	
		
		int notas20 = resto50/20;
		int resto20 = resto50%20;
		
		int notas10 = resto20/10;
		int resto10 = resto20%10;
		
		int notas5 = resto10/5;
		int resto5 = resto10%5;
		
		int notas2 = resto5/2;
		int resto2 = resto5%2;			
						
		int moedas1 = resto2/1;

		double valormoedas = (valor - valorint)*100;		
		int moedasint = (int)valormoedas;
		
		int moedas050 = moedasint/50;
		int resto050 = moedasint%50;
		
		int moedas025 = resto050/25;
		int resto025 = resto050%25;
		
		int moedas010 = resto025/10;
		int resto010 = resto025%10;
		
		int moedas005 = resto010/5;
		int resto005 = resto010%5;
		
		int moedas001 = resto005/1;
		
		System.out.println("NOTAS:\n" + notas100 + " nota(s) de R$ 100.00\n" + notas50 + " nota(s) de R$ 50.00\n" + notas20 + " nota(s) de R$ 20.00\n"
				 + notas10 + " nota(s) de R$ 10.00\n" + notas5 + " nota(s) de R$ 5.00\n" + notas2 + " nota(s) de R$ 2.00\nMOEDAS:\n" + moedas1 +
				 " moeda(s) de R$ 1.00\n" + moedas050 + " moeda(s) de R$ 0.50\n" + moedas025 + " moeda(s) de R$ 0.25\n" + moedas010 + " moeda(s) de R$ 0.10\n"
				  + moedas005 + " moeda(s) de R$ 0.05\n"+ moedas001 + " moeda(s) de R$ 0.01");

		input.close();
	}
}