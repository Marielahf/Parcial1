import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa10A {

	public static void main(String[] args) {
		Scanner leer=new Scanner (System.in);
		DecimalFormat formateador = new DecimalFormat ("###,###.##");
		
			int num, prod;
			double suma, prom, incr, c, precio;
			suma=0;
			c=1;
			
			System.out.println("¿Cuántos productos comprará? ");
			prod=leer.nextInt();
			do {
				System.out.println("Precio del producto " + c);
				precio = leer.nextDouble();
				if (c>0 & c<=prod){
					suma=suma+precio;
					c++;
			}
				}
			while (c>0 & c<=prod);
			if (suma>=1500)
			{
				System.out.println ("El incremento es del 11%");
				incr = ((suma*11)/100);
				System.out.println ("De " + suma + " el 11% es de ");
				System.out.println (formateador.format (incr));
				incr = suma + incr;
				System.out.println ("El total a pagar es de: ");
				System.out.println (formateador.format (incr));
			}
			else 
			{
				System.out.println ("El incremento es del 10%");
				incr = ((suma*10)/100);
				System.out.println ("De " + suma + " el 10% es de ");
				System.out.println (formateador.format (incr));
				incr = suma + incr;
				System.out.println ("El total a pagar es de: ");
				System.out.println (formateador.format (incr));
			}
	}
}
