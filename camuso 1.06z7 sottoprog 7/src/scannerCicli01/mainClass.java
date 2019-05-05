package scannerCicli01;

class contenitore{
	public int n=333;
}

public class mainClass {
	public static void raddoppia(contenitore cont) {
		//System.out.println("Ho ricevuto il numero:"+numero+"\n");
		cont.n*=2;
		cont=new contenitore();
		//System.out.println("Che raddoppiato fa:"+numero+"\n");
	}
	
	public static void main(String args[]) {
		//int n=333;
		
		contenitore c=new contenitore();
		System.out.println("Prima del richiamo del metodo"+c.n+"\n");
		raddoppia(c);
		System.out.println("Dopo il richiamo del metodo"+c.n+"\n");
		
		
	}
	
	
}
