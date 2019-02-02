import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner (System.in);
		String nombre;
		int edad;
		double altura;
		
		System.out.println("Escriba su nombre: ");
		nombre=leer.nextLine();
		System.out.println("Escriba su edad: ");
		edad=leer.nextInt();
		System.out.println("Escriba su altura: ");
		altura=leer.nextDouble();
		
		System.out.println("Su nombre: "+nombre);
		System.out.println("Su edad: "+edad);
		System.out.println("Su altura: "+altura);
	}

}
