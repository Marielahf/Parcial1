import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		Scanner leer=new Scanner (System.in);
		int edad;
		
		System.out.println("Ingrese su edad: ");
		edad=leer.nextInt();
		if(edad>=18) {
			System.out.println("ERES MAYOR DE EDAD");
		}

	}

}
