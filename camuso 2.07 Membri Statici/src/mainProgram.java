import java.awt.List;

import java.util.ArrayList;
import java.util.Random;

public class mainProgram {
	public static void main(String[] args) {			
		Random r= new Random();		
		for(int i=0;i<10000;i++)
			if(r.nextInt(10)==5)
				new Punto();  //il conta contera i punti		
		//double areaCerchio= Math.PI*Math.pow(27.2,2);
	    System.out.println("Sono stati creati "+Punto.getConta()+" punti");//probabilita 1 su 10
	}
}