import java.util.Scanner;
import java.util.Locale;
//import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
	
		Scanner input = new Scanner(System.in);
				
		String[] diaI = new String[2];
		
		diaI[0] = input.next();
		diaI[1] = input.next();
		
		int _diaI = Integer.parseInt(diaI[1]);
		
		String[] horaI = new String[5];
		
		horaI[0] = input.next();
		horaI[1] = input.next();
		horaI[2] = input.next();
		horaI[3] = input.next();
		horaI[4] = input.next();
		
		int _horaI = Integer.parseInt(horaI[0]);
		int _minI = Integer.parseInt(horaI[2]);
		int _segI = Integer.parseInt(horaI[4]);		
		
		diaI[0] = input.next();
		diaI[1] = input.next();
		
		int _diaF = Integer.parseInt(diaI[1]);
		
		String[] horaF = new String[5];
		
		horaF[0] = input.next();
		horaF[1] = input.next();
		horaF[2] = input.next();
		horaF[3] = input.next();
		horaF[4] = input.next();
		
		int _horaF = Integer.parseInt(horaF[0]);
		int _minF = Integer.parseInt(horaF[2]);
		int _segF = Integer.parseInt(horaF[4]);
		
		int dur_seg = _segF - _segI;
		int dur_min = _minF - _minI;
		int dur_hora = _horaF - _horaI;
		int dur_dia = _diaF - _diaI;
		
		if (dur_seg < 0) {
			dur_seg+=60;
			dur_min-=1;
		}		
		
		if (dur_min < 0) {
			dur_min+=60;
			dur_hora-=1;
		}		
		
		if (dur_hora < 0) {
			dur_hora+=24;
			dur_dia-=1;
		}
		
		System.out.println(dur_dia + " dia(s)");
		System.out.println(dur_hora + " hora(s)");
		System.out.println(dur_min + " minuto(s)");
		System.out.println(dur_seg + " segundo(s)");

		input.close();		
	}
}