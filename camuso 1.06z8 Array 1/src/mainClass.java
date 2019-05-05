import java.util.*;

//String[] giorniSettimana = {"Lunedi","Martedi","Mercoledi","Giovedi","Venerdi","Sabato","Domenica"};

public class mainClass {
	
	public static void main(String[] args) {
		Random r=new Random();
		double totaleincassi=0;
		double[] incassiGiornalieri=new double[30];
		
		for(int giorno=1;giorno<30;giorno++) {
			System.out.println("Inserire l'incasso per il giorno "+giorno+" ");
			incassiGiornalieri[giorno]=r.nextDouble()*10000;
			System.out.println(incassiGiornalieri[giorno]);
			totaleincassi+=incassiGiornalieri[giorno];
			
		}
		double mediaincassi=totaleincassi/30;
		System.out.println("Incasso medio giornaliero: "+mediaincassi);
		System.out.println(r.nextDouble());
		
		
		
		for(int giorno=1;giorno<30;giorno++) {
			if(incassiGiornalieri[giorno]<mediaincassi)
				System.out.println("Il giorno "+(giorno+1)+" del mese l' incasso "+"("+incassiGiornalieri[giorno]+")"+" risulta "+"inferiore alla media");
		}
		int temperatura=Integer.parseInt("111",2);
		System.out.println(temperatura);
	}	
}
