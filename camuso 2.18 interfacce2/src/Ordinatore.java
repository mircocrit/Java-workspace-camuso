public class Ordinatore{	//non implementa ordinable
  Ordinabile[] v=null;
  
  public Ordinatore(Ordinabile[] _v){	v = _v.clone(); }	//costruttore, l'oggetto passato deve rispettare l'intefaccia ordinable

  int posMin(int partiDa){
	  int posizioneMinimo=partiDa,   
		  posizioneCorrente=partiDa+1;
	  
	  while (posizioneCorrente<v.length){
		  if(v[posizioneCorrente].minoreDi(v[posizioneMinimo]) )
			  posizioneMinimo = posizioneCorrente;
		  posizioneCorrente++;
	  }
	  return posizioneMinimo;
  } 
  
  Ordinabile[] selectionSortA_Z(){
	 for (int i=0; i<v.length - 1; i++){
		 int posizioneMinimoDeiRimanenti = posMin(i);
	     Ordinabile tmp = v[i];
		 v[i] = v[posizioneMinimoDeiRimanenti];
		 v[posizioneMinimoDeiRimanenti] = tmp;
	 }
	 return v;	 
  }
}
