import java.io.*;

public class prova01 {
	
	static double LeggiDouble(String messaggio, double minimo, double massimo) {
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		
		String rigaLetta ="";
		double risultato=0.0;
		
		boolean errore = false;
		
		do {
			errore=false;
			try {
				System.out.println(messaggio);
				rigaLetta=bufferTastiera.readLine();	
				risultato = Double.parseDouble(rigaLetta);
			}
			catch(NumberFormatException e){
				System.out.println("Non e' un numero,riprova");
				errore=true;
			}
			
			catch(IOException e) {
				System.out.println("Problemi con il dispositivo,riprova");
				errore=true;
			}
			
			if(risultato<minimo|| risultato>massimo) {
				System.out.println("valore non accettabile: ("+minimo+"-"+massimo+")");
				errore=true;
			}
			
			
		}while(errore || risultato<minimo || risultato>massimo);	//=true
		return risultato;
	}

	public static void main(String[] args) {
		double sommaIniziale=0;
		double sommaFinale=0;
		double percentualeInteresse=0;
		int anniDeposito=0;
		
		sommaIniziale= LeggiDouble("Inserire somma iniziale: ",100,2000);
		percentualeInteresse= LeggiDouble("Inserire percentuale di interesse: ",2.5,10.5);
		
	}
}
