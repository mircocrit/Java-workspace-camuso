import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class scanner {
	static double leggiDouble(String messaggio, double minimo, double massimo){
		  
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
	   		
		String rigaLetta =""; double risultato = 0.0;
		  
		boolean errore; 
		do {
			errore = false;
		      
			try {    
			  System.out.print(messaggio);
			  rigaLetta = bufferTastiera.readLine();
			  risultato = Double.parseDouble(rigaLetta);
			 }
			  
		    catch (NumberFormatException e){
		      System.out.println("Non è un numero, riprova");  
		  	  errore = true;
		    }
			  
			catch (IOException e){
			  System.out.println("Problemi con il dispositivo di input");  
			  errore = true;
			}
		 
			if (risultato < minimo || risultato>massimo)
		    {
			  System.out.println("Valore non accettabile ("+minimo+"-"+massimo+")");  
			  errore = true;		    	
		    }
		  } while (errore || risultato < minimo || risultato>massimo); 
	return risultato; 		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sommaIniziale=0;
		double sommaFinale=0;
		double percentualeInteresse=0;
		int anniDeposito=0;
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Inserire durata deposito in anni");
		anniDeposito=sc.nextInt();
		System.out.println("Hai inserito il valore"+anniDeposito);

			
		//sommaIniziale= LeggiDouble("Inserire somma iniziale: ");
		//percentualeInteresse= LeggiDouble("Inserire percentuale di interesse: ");
	}
}