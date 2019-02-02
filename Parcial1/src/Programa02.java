import java.util.Scanner;////Librería para dar entrada por teclado.

public class Programa02 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner (System.in);//Se crea una instancia de Scanner llamada leer.
		
		String nombre;//Se crea una variable de tipo String llamada nombre
		
		System.out.println("Ingrese su nombre:");
		nombre=leer.nextLine();//se le da la entrada a su valor por el teclado
		
		System.out.println("Hola "+nombre);//Impresion
	}

}
