package es.studium.Descomponer;

import java.util.Scanner;

public class Descomponer {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	String cadena1,cadena2;
	
	System.out.println("Escribe la cadena");
	
	cadena1=teclado.nextLine();
	
    
	cadena2=cadena1.replace(' ', '\n');
    System.out.println(cadena2);
	teclado.close();


}
}
