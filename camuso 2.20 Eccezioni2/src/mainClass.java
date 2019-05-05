public class mainClass {
	static int mediaInteraVett(int[] v,int diQuanti) {
		int somma=0;
		for(int i=0;i<diQuanti;i++)
			somma+=v[i];		
		if(diQuanti!=0)
			return somma/diQuanti;
		else 
			throw new IllegalArgumentException();	//eccezione dichiarata
	}

	public static void main(String[] args) {	
		
		int[] vettore= {3,8,-17,3,5,322,233,12,33};
		try{
			System.out.println("Media "+ mediaInteraVett(vettore,4));	
		}
		catch(IllegalArgumentException eccezione) {}			
		}
}