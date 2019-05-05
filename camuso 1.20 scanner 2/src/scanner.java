import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class scanner {
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
		double sommaIniziale=0;
		double sommaFinale=0;
		double percentualeInteresse=0;
		int anniDeposito=0;
			
		//Scanner sc= new Scanner(System.in);
		
		
		//System.out.println("Inserire durata deposito in anni");
		/*
		if(sc.hasNextInt()) {
			anniDeposito=sc.nextInt();
			System.out.println("Hai inserito il valore"+anniDeposito);
		}
		*/
		
		sommaIniziale=leggiDouble2("inserire la somma iniziale: ",100,2000);
		percentualeInteresse=leggiDouble2("Inserire la percentuale di interesse:",2.5,10.5);
		
		//sommaIniziale=leggiDouble2("inserire la somma iniziale: ");
		//percentualeInteresse=leggiDouble2("Inserire la percentuale di interesse:");
	}
	
}