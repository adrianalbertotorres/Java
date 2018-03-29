package Programa;
/**4. Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una
 * . A continuación realiza las instrucciones necesarias para que: B tome el valor de C,
 *  C tome el valor de A, A tome el valor de D, D tome el valor de B.
 * @author Java
 *
 */

public class Elercicio4 {

	public static void main(String[] args) {
		
    int A , B, C, D, X;
    A=1;B=2;C=3;D=4;X=0;
    
    System.out.println("El valor de A es : " + A);
    System.out.println("El valor de B es : " + B);
    System.out.println("El valor de C es : " + C);
    System.out.println("El valor de D es : " + D);
    X=B;B=C;C=A;A=D;D=X;
    System.out.println("El valor de A es : " + A);
    System.out.println("El valor de B es : " + B);
    System.out.println("El valor de C es : " + C);
    System.out.println("El valor de D es : " + D);
    

		
		
	}

}
