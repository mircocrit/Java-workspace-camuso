import java.io.*;
//java.lan.system.in
public class prova01 {
	public static void main(String[] args) {	
		//double sommaIniziale=0;
		//double sommaFinale=0;
		//double percentualeInteresse=0;
		//int anniDeposito=0;
		
		int carattereLetto=-1;
		String rigaLetta="";
		
		
		System.out.println("Inserisci una parola e premi invio:---->");
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		try {
			//carattereLetto= tastiera.read();
			rigaLetta=bufferTastiera.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("IL codice ascii della prima lettera che hai inserito e' :"+ rigaLetta);
	}

}

