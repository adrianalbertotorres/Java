package Programa;
/** 11. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el principio como en el ejemplo.*/
import java.util.Scanner;

public class Secuencia11 {
 public static void main(String[] args) {

	 int N;
	 Scanner Scan = new Scanner(System.in);
	 System.out.println("Ingrese un numero de 5 cifras ");
	 N = Scan.nextInt();
	 while  (N < 10000 || N >= 100000) {
		 System.out.println("Reingre el numero : ");
		 N = Scan.nextInt();
	 }
	 System.out.println("Ingrese un numero de 5 cifras ");
 }
 
}