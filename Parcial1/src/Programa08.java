import java.util.Scanner;
public class Programa08 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int dia;
		System.out.println ("Escribe un número del 1 al 7");
		dia = leer.nextInt();
		switch (dia)
		{
		case 1: 
			System.out.println ("DOMINGO");
			break;
		case 2:
			System.out.println ("LUNES");
			break;
		case 3: 
			System.out.println ("MARTES");
			break;
		case 4:
			System.out.println ("MIERCOLES");
			break;
		case 5: 
			System.out.println ("JUEVES");
			break;
		case 6:
			System.out.println ("VIERNES");
			break;
		case 7:
			System.out.println ("DOMINGO");
			break;
			default:
				System.out.println ("NÚMERO INVALIDO");
				break;
			
		}

	}

}
