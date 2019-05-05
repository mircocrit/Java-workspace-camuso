public class mainClass{
	static int mediaInteraVett(int[] v,int diQuanti) {
		int somma=0;
		for(int i=0;i<diQuanti;i++)
			somma+=v[i];		
		if(diQuanti!=0)
			return somma/diQuanti;
		else 
			return 0;
	}

	public static void main(String[] args) {		
		int[] vettore= {3,8,-17,3,5,322,233,12,33};
		System.out.println("Media"+ mediaInteraVett(vettore,0));	
	}
}
