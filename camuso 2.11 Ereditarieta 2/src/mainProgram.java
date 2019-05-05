import java.awt.List;

import java.util.ArrayList;
import java.util.Random;

public class mainProgram {
	public static void main(String[] args) {			
		Quadrato q=new Quadrato(1,1,3);
		System.out.println("Perimetro: " + q.perimetro());
		System.out.println("Area: " + q.area());
	}
}