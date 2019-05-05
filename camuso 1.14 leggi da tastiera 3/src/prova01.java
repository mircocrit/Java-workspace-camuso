import java.io.*;
import java.util.Scanner;

public class prova01 {

	public static void main(String[] args) {
		double sommaIniziale=0;
		double sommaFinale=0;
		double percentualeInteresse=0;
		int anniDeposito=0;
		
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		
		String rigaLetta ="";
		double risultato=0.0;
		
		boolean errore = false;
		
		do {
			errore=false;
			try {
				System.out.println("Inserire la somma iniziale:");
				rigaLetta=bufferTastiera.readLine();	
				risultato = Double.parseDouble(rigaLetta);
			}
			catch(NumberFormatException e){
				System.out.println("Non e' un numero,riprova");
				errore=true;
			}
			
			catch(IOException e) {
				errore=true;
				
			}
		}while(errore==true);
	}
}
