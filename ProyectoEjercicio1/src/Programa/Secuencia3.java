package Programa;
import java.util.Scanner;
public class Secuencia3 {
/*3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.*/
	public static void main(String[] args) {
		
		int a;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Ingrese un numero :");
		a = Scan.nextInt();
		System.out.println("El doble es :" + (a * 2));
		System.out.println("El triple es :" + (a * 3));
	}

}
