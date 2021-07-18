import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	// 5% wrong
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int q_horas = 0, q_min = 0;

		Scanner input = new Scanner(System.in);
			
		int hora_i = input.nextInt();
		int min_i = input.nextInt();
		
		int hora_f = input.nextInt();
		int min_f = input.nextInt();
		
		if(hora_f > hora_i) {
			q_horas = hora_f - hora_i;
		}
		
		if(hora_f <= hora_i) {
			q_horas = 24 - hora_i + hora_f;
		}
		
		if(min_f > min_i) {
			q_min = min_f - min_i;			
		}
		
		if(min_f <= min_i) {
			q_min = 60 - min_i + min_f;
			q_horas--;
		}
		
		if(q_min==60) {
			q_horas++;
			q_min=0;
		}
		
		System.out.print("O JOGO DUROU " + q_horas + " HORA(S) E " + q_min + " MINUTO(S)\n");
		
		input.close();
	}
}