package scannerCicli01;

import java.awt.Color;

public class mainClass {

	static void stampaRigaLn(char simbolo, int quanti) {
		stampaRiga(simbolo,quanti,true);
	}
	static void stampaRiga(char simbolo, int quanti) {
		stampaRiga(simbolo,quanti,false);
	}
	
	static void stampaRiga(char simbolo, int quanti,boolean aCapo) {
		for(int i=0;i<quanti;i++)
			System.out.print(simbolo);
		if(aCapo)	System.out.println();
	}
	
	static String clona(char simbolo, int quanteVolte) {
		String riga="";
		for(int i=0;i<quanteVolte;i++)
			riga+=simbolo;
		return riga;
	}
	
	static void messaggio(String ilMessaggio,char simbolo,int lunghezza) {

		String riga=clona(simbolo,lunghezza);
		System.out.println(riga);
		stampaRiga(simbolo,lunghezza);
		System.out.println("\n"+ilMessaggio+"\n");
		
		//for(int i=0;i<lunghezza;i++)
			//System.out.println(simbolo);
		stampaRigaLn(simbolo,lunghezza);
	}
	public static void main(String[] args) {
		messaggio("ciao ciao...",'*',30);
		messaggio("ATTENZIONE....",'-',50);
		
	}
}
