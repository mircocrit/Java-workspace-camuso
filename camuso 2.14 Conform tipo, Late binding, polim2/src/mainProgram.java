import java.awt.List;

import java.util.ArrayList;
import java.util.Random;

public class mainProgram {
	public static void main(String[] args) {			
		Figure f=new Quadrato(10,40,100);
		System.out.println("Perimetro: " + f.perimetro());
		System.out.println("Area: " + f.area());
	}
}