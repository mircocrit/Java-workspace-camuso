import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class prova01 {
	
	static int leggiInt(String messaggio){
		System.out.print(messaggio);
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNextInt() ) {
		   System.out.println("Inserire un *numero INTERO*");
		   sc.nextLine();  //consumo dato sbagliato
		}
		return sc.nextInt();		
	}
	//versione input con scanner
	static double leggiDouble2(String messaggio){
		System.out.print(messaggio);
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNextDouble() ){
		   System.out.println("Inserire un *numero*");
		   sc.nextLine();  //consumo dato sbagliato
		}
		return sc.nextDouble();		
	}
	
	public static double leggiDouble2(String messaggio, double minimo, double massimo){
		double num=0;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println(messaggio);
			while (!sc.hasNextDouble()) {
		      System.out.println("Inserire un numero!");
			  System.out.println(messaggio);
		      sc.nextLine();
		    }
			
			num = sc.nextDouble();
			
			if (num < minimo || num>massimo)
			  System.out.println("Valore non accettabile ("+minimo+"-"+massimo+")");  
		} while (num < minimo || num>massimo);
		
		return num;
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
	
      
	  sommaIniziale = leggiDouble2("Inserire somma iniziale: ", 100, 2000);
	  percentualeInteresse = leggiDouble2("Inserire percentuale annuale di interesse: ", 2.5, 10.5);
      anniDeposito = leggiInt("Durata in anni del deposito: ");
      
      sommaFinale = sommaIniziale;
      while(anniDeposito>0)
      {
    	  sommaFinale = sommaFinale+ sommaFinale/100 * percentualeInteresse;
    	  anniDeposito = anniDeposito -1;
      }
      
      System.out.println("Hai ora in banca: " + sommaFinale +" euro :)");
	  
	  System.out.println("Fine programma ...");
	}

}