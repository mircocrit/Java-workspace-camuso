import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class telefono {
	
	public static String leggiTelefono(){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Inserire un numero telefonico: xxx-xxxxxxx || xxxx-xxxxxx");
	    while (!sc.hasNext("[0-9]{2,4}\\-[0-9]{6,7}")){//espressione regolare
	        System.out.println("Formato errato,, ripetere");
	        sc.next();
	    }
	    return sc.next();	
	}

	
	public static void main(String[] args) {
	  // TODO Auto-generated method stub
     
	 /* dati input
	  *  somma iniziale
	  *  percentuale di interesse annuale
	  *  numero di anni deposito
	  * 	  
	  * */
	  
	  double sommaIniziale = 0;
	  double sommaFinale = 0;
	  double percentualeInteresse = 0;
	  int anniDeposito = 0;
	
	  System.out.println(leggiTelefono());
	  System.out.println("Fine programma ...");
	}

}