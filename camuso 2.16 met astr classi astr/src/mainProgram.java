import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class mainProgram {
	public static void main(String[] args) {
	    Figure f = new Quadrato(10,40,100);	    
	    Figure[] disegno = new Figure[1000];	
	    
	    disegno[0] = new Quadrato(10, 10, 200);
	    disegno[1] = new Quadrato(30, 10, 50);
	    disegno[2]= new Cerchio(100,100, 70);
	    disegno[3] = new Rettangolo(15, 10, 150,89);
	    disegno[4] = new Quadrato(30, 10, 50);
	    int numeroFigure = 5;
	    double totPerimetri = 0;	       
	    for (int i=0; i<numeroFigure;i++ )
	      totPerimetri+=disegno[i].perimetro();
	    
	    System.out.println(totPerimetri);
	}	
}


