import java.io.*;
import java.util.Scanner;

public class prova02 {
	public static void main(String[] args) {
		double sommaIniziale=0;
		double sommaFinale=0;
		double percentualeInteresse=0;
		int anniDeposito=0;
		
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		
		String rigaLetta ="";
		
		try {
			System.out.println("Inserire la somma iniziale:");
			rigaLetta=bufferTastiera.readLine();
			sommaIniziale = Double.parseDouble(rigaLetta);
		}
		catch(NumberFormatException e){
			System.out.println("Non e' un numero,riprova");
		}
		
		catch(IOException e) {
			
		}

		
	}
}
