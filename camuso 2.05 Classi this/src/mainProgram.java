import java.awt.List;

import java.util.ArrayList;
import java.util.Random;

public class mainProgram {
	public static void main(String[] args) {	
	    Punto p1;  
	    p1=new Punto(23,-12);
	    System.out.println("il punto si trova nel quadrante n°"+p1.LocalizzaQuadrante());
	}
}