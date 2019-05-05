public class Punto{	
	private int x=0; 	//stato interno
	private int y=0;
	private int z=0;
	
	public Punto(int _x,  int _y){	x = _x; setY(_y);}		//costruttori
	public Punto(int _x){x = _x;}
	
	public void setX(int _x){	x = _x;}	//setter
	public void setY(int y) {this.y = y;}
	public int getX() {		return x;}	//getter
	public int getY() {return y;}
}

