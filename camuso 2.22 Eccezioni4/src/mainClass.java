import java.*;
import java.io.FileNotFoundException;
import java.io.*;

public class mainClass {
	static int mediaInteraVett(int[] v,int diQuanti) throws FileNotFoundException{
		int somma=0;		
		try {
			PrintWriter backup= new PrintWriter("z:\nonEsisto.txt");
		}
		catch(FileNotFoundException e){
			//e.printStackTrace();
			System.out.println("Il file di backup non puo essere creato");
		}
		//finally {}
		for(int i=0;i<diQuanti;i++)
			somma+=v[i];		
		if(diQuanti!=0)
			return somma/diQuanti;
		else 
			throw new ArithmeticException();
	}
	
	static int metodoIntermedio(int[] v,int diQuanti) throws FileNotFoundException {
		try {
			return mediaInteraVett(v,diQuanti);
		}
		catch(ArithmeticException errore){
			return -1;
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		int[] vettore= {3,8,-17,3,5,322,233,12,33};
		System.out.println("Media "+ metodoIntermedio(vettore,6));	
	}
}