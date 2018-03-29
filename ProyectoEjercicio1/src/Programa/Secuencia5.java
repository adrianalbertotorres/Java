package Programa;

/*5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia.
 *  Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
 */

import java.util.Scanner;

public class Secuencia5 {
	public static void main(String[] args) {
	
	double rad ;
	Scanner Scan = new Scanner(System.in);
	System.out.println("Coloque el valor del radio de la circunferencia : ");
    rad = Scan.nextInt();
    System.out.println("El perimetro de la circunferencia es : " + (2*3.1416*rad)  );
    System.out.println("El volumen de la circunferencia es : " + (3.1416 * (rad * rad)));

	}

}
