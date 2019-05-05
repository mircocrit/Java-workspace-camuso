public class Punto{
	private int x=0; 
	private int y=0;
	static private int conta=0;
	
	public Punto(){	this(0,0);}	
	public Punto(int _x,  int _y){	
		super();		
		x = _x; 
		setY(_y);
		conta++;
	}		
	public Punto(int _x){	this(_x,0);}
	
	static public int getConta(){ return conta;}	

	public void setX(int _x){x = _x;}
	public void setY(int y) {this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
		
	public int LocalizzaQuadrante(){ 
	   if (x>0 && y>0) 
		   return 1;
	   else
		   if (x<0 && y>0) 
			   return 2;	
		   else
			   if (x<0 && y<0) 
				   return 3;
			   else
				   if (x>0 && y<0) 
					   return 4;
				   else
					  return 99; 
	}
}