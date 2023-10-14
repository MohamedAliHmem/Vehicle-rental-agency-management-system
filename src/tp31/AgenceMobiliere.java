package tp31;

public class AgenceMobiliere{
	private Vehicule [] tab ;
	private int max ;
	private int nb ;
	
	
	AgenceMobiliere(int max) {
		tab = new Vehicule[max];
		this.max = max ;
	}
	
	void ajoutVehicule(Vehicule v) {
		if (nb<max) {
			tab[nb]=v;
			this.nb++;
		
		}else {
			System.out.println("le tableau est complet");
		}
	}
	
	void selection (int n) {
		if(n<nb && n>=0) {
			tab[n].decrisVehicule();
		}
	}
	void selection (String mq) {
		int t=0;
		for(int i=0;i<this.nb;i++) {
			if(tab[i].getMarque()==mq) {
				tab[i].decrisVehicule();
				t=1;
			}
		}
		if(t==1)
			System.out.println("il n'y a pas de vehicule de cette marque");
	}
	void selection (double px) {
		int t=0;
		for(int i=0;i<this.nb;i++) {
			if (tab[i].getPrix()<px) {
				tab[i].decrisVehicule();
				t=1;
			}
		}
		if(t==0)
			System.out.println("il n'y a pas de vehicule de cette marge");
	}
	
	void plusAncien()
	{
		Vehicule vAncien=tab[0];
		for(int i=1;i<nb;i++) {
			if(tab[i].getAnnee()<vAncien.getAnnee())
				vAncien=tab[i];
			
		}
		vAncien.decrisVehicule();
		
	}
	void decrisAg()
	{
		for (int i=0;i<this.nb;i++) {
			tab[i].decrisVehicule();
		}
	}
	
	public static void main(String[] args) {
		
		AgenceMobiliere ag = new AgenceMobiliere(3);
		Vehicule v=new Vehicule("Clio","Classique",2009,20000);
		Vehicule w=new Vehicule("Mercedes","Fantome",2008,60000);
		Vehicule x=new Vehicule("KIA","Picanto",2012,35000);
		/*ag.tab[0] = v ;
		ag.tab[1] = w ;
		ag.tab[2] = x ;*/
		
		ag.ajoutVehicule(v);
		ag.ajoutVehicule(w);
		ag.ajoutVehicule(x);
		
		/*
		ag.tab[0].decrisVehicule();
		ag.tab[1].decrisVehicule();
		ag.tab[2].decrisVehicule();
		
		ag.selection("Mercedes");
		
		ag.selection(40000);
		*/
		ag.decrisAg();
		ag.plusAncien();
		
	}
	
	
	
}
