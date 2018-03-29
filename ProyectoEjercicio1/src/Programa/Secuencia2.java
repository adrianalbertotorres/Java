package Programa;

/*/2. Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.*/
import java.util.Scanner;
public class Secuencia2 {

	public static void main(String[] args) {
    String nombre;
    Scanner Scan = new Scanner(System.in);
    System.out.println("Ingrese un Nombre :");
    nombre = Scan.nextLine();
    System.out.println("El nombre que ingreso es :" + nombre);
	}

}
