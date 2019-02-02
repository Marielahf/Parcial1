import java.util.Scanner;

public class Programa07 {
	public static void main (String [] args) {
		Scanner leer=new Scanner (System.in);
		
		double gf;
		double gc;
		
		System.out.println ("Ingrese temperatura en grados Fahrenheit: ");
		gf=leer.nextInt();
		gc=(gf-32)/1.8;
		System.out.println ("Fahrenheit: "+gf+" en centigrados, es: "+gc);
	}
}
