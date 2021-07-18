import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int hora_i, hora_f, duracao;
		
		hora_i = input.nextInt();
		hora_f = input.nextInt();

		if (hora_f > hora_i) {
			duracao = (hora_f - hora_i);
		}
		
		else {
			duracao = (24 - hora_i + hora_f);
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		input.close();
	}
}