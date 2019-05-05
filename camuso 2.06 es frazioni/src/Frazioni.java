public class Frazioni{
	int num=0, den=1;
	
    public Frazioni(int _num, int _den){
        num = _num; 
        if (_den!=0) 	den = _den; 
        else 			den=1;
    }	
    
    public Frazioni(int _num){		this(_num, 1);}
    
    public Frazioni(String f){    	
      this(Integer.parseInt(f.split("/")[0]),Integer.parseInt(f.split("/")[1]) );	
    }	//es: "23/43"
    
    public String ToString(){return num + "/" + den; }
    
    public Frazioni Somma(Frazioni altra){
    	return new Frazioni(num*altra.den + den*altra.num, den*altra.den);
      }
}
