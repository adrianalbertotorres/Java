package Programa;

import java.util.Scanner;

/*8. Programa que calcula el volumen de una esfera.  V=*/

public class Secuencia8 {
  public static void main(String[] args) {
	  
  double radio,volumen;
  Scanner Scan = new Scanner(System.in);
  System.out.println("Ingrese el radio de la esfera:");
  radio = Scan.nextDouble();
  volumen = Volesf(radio);
  System.out.println("el volumen de la esfera es:" + volumen);
  
  
  
	
}
  private static double Volesf(double radio) {
	 
	double volumen = 4 * Math.PI * Math.pow(radio, 3);  
	  return volumen;
			  
  }
}
