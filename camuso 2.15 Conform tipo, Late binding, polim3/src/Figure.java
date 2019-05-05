import java.awt.Color;

enum tipiTratto {fine, medio, normale, forte};

public abstract class Figure {
  Color penna = Color.black;
  tipiTratto spessore = tipiTratto.normale;
  
  public Figure() {}
  
  public Figure(Color c, tipiTratto tratto){   
	  this();
	  penna = c; spessore=tratto;
  }
  
  abstract double perimetro();  
  abstract double area();  
}
