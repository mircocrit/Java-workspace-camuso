import java.awt.Color;

enum tipiTratto {fine, medio, normale, forte};

public abstract class Figure {	//classe astratta con metodi non dotati di implementazoine se abstract
  Color penna = Color.black;
  tipiTratto spessore = tipiTratto.normale;
  
  public Figure() {}	//costruttore
  abstract double perimetro();
  
  public Figure(Color c, tipiTratto tratto){//color(importato), enum
	  this();
	  penna = c; spessore=tratto;
  }
}
