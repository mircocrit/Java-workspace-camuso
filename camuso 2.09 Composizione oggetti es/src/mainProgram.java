import java.awt.List;

import java.util.ArrayList;
import java.util.Random;

public class mainProgram {
	public static void main(String[] args) {		
		Rettangolo q=new Rettangolo(1,1,3,3);
		System.out.println("Perimetro: " + q.perimetro());
		System.out.println("Area: " + q.area());
	}
}