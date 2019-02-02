import java.util.Scanner;

public class Programa06 {
	public static void main(String [] args ) {
		Scanner leer=new Scanner (System.in);
		
		int numero;
		
		System.out.println ("Ingrese un número entero");
		numero=leer.nextInt();
		if (numero%2 == 0){
			System.out.println ("PAR");
		}else{
			System.out.println ("IMPAR");
		}
	}

}
