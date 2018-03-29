package Programa;

public class Ejercicio3 {

	/**3. Programa Java que declare una variable entera N y asígnale un valor.
	 *  A continuación escribe las instrucciones que realicen lo siguiente: Incrementar N en 77, Decrementarla en 3, Duplicar su valor. 
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int N = 10;
	
	System.out.println("El incremento de N en 77  es :" + (N += 77));
	System.out.println("Al decrementarla en 3 es :" + (N -= 3));
	System.out.println("Al duplicar su valor es :" +(N *= 2));
	}

}
