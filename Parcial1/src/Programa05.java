import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		Scanner leer=new Scanner (System.in);
		
		float cal;
		
		System.out.println("Ingrese su calificación: ");
		cal=leer.nextFloat();
		if(cal>=80) {
			System.out.println("APROBADO");
		}else {
			System.out.println("REPROBADO");
		}

	}

}
