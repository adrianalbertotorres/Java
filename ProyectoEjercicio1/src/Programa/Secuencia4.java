package Programa;

/* 4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5) */

import java.util.Scanner;
public class Secuencia4 {

	public static void main(String[] args) {
	double centigrados;
	double far;
	Scanner Scan = new Scanner(System.in);
	
	System.out.println("Ingrese grados centigrados :");
    centigrados = Scan.nextInt();
    far = 32 + ( 9 * centigrados / 5);
    System.out.println("Equivalen a "+ far + "  Fahrenheit");
	}

}
