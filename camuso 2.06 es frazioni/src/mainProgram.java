import java.awt.List;

import java.util.ArrayList;
import java.util.Random;

public class mainProgram {
	public static void main(String[] args) {	
	   Frazioni f=new Frazioni("23/43");
	   Frazioni fsomma=f.Somma(new Frazioni("3/4"));
	   System.out.println(f.ToString());
	   System.out.println(fsomma.ToString());
	}
}