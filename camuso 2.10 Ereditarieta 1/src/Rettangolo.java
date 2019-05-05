public class Rettangolo{
  private Punto AngoloUpSx=null;
  private int base = 0, altezza=0;
  
  public Rettangolo(int x1, int y1, int b, int h){   
	  AngoloUpSx = new Punto(x1,y1); base=b; altezza=h;}//richiamo il punto
  
  public Rettangolo(){ this(0,0,2,1);} 
  
  public Rettangolo(Punto p, int x2, int y2){ 
	  this(p.getX(), p.getY(), x2-p.getX(), y2-p.getY());}	//con coordinate angolo in alto a sinistra e quelle dell'angolo in basso a destra
    
  public double perimetro() {return 2*(base+altezza);} 
  public double area() {return base*altezza;}
}
