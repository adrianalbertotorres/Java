package Programa;

public class Ejercicio2 {

	/**2. Programa java que realice lo siguiente: 
	 * declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor.
	 *  A continuación reliza y muestra muestra por pantalla una serie de operaciones entre ellas. 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int X = 4		;
      int Y = 2;
      double N = 3;
      double M = 4;
      
      /*La suma  X + Y
        * La diferencia  X – Y
         * El producto  X * Y
          *El cociente  X / Y
           *El resto  X % Y
           */
      System.out.println("La suma de X + Y es :" +(X + Y));
      System.out.println("La diferencia de X - Y es: " + (X - Y));
      System.out.println("El cociente de X / Y es: " + (X / Y));
      System.out.println("El resto de X % Y es; " + (X % Y));
    
      
      
      /*La suma X + N
       *El cociente Y / M
       *El resto Y % M
       **/
      System.out.println("La suma de X + N es :" +(X + N));
      System.out.println("El cociente de Y / M es :" +(Y / M));
      System.out.println("El resto de Y % M es; " + (Y % M));
      
      
      /*El doble de cada variable
       *La suma de todas las variables
       *El producto de todas las variables
       */
      
      System.out.println("El doble de X es :" +(X * 2));
      System.out.println("El doble de y es :" +(Y * 2));
      System.out.println("El doble de N es :" +(N * 2));
      System.out.println("El doble de X es :" +(M * 2));
      System.out.println("La suma de todas las variables es :" +(X + Y + N + M));
      System.out.println("La producto de todas las variables es :" +(X * Y * N * M));
    
	}
	

}
