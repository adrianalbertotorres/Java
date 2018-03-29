package Programa;
/**1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 * 
 * @author Java
 *
 */
import java.util.Scanner;

public class Secuencia1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int primero, segundo;
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese un numero :");
    primero =scan.nextInt();
    System.out.println("Ingrese un numero :");
    segundo = scan.nextInt();
    System.out.println();
    System.out.println(String.format("Los numeros ingresados fueron :%d y %d", primero,segundo));
	}

}
