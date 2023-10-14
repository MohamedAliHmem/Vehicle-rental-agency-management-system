package tp31;

public class Vehicule {
	private int num ;
	private String marque ;
	private String modele ;
	private int annee ;
	private double prix ;
	private static int count ;

Vehicule(String marque , String modele, int annee,double prix){
	this.marque = marque;
	this.modele = modele;
	this.annee = annee ;
	this.prix = prix ;
	this.count++;
	this.num=count;
}

void decrisVehicule() {
	System.out.println("Vehicule numero"+num+" [marque=" + marque + ", modele=" + modele + ", annee=" + annee + ", prix=" + prix + ", count="
			+ count + "]");
}

String getMarque() {
	return this.marque;
}
void setMarque(String mar) {
	this.marque = mar ;
}

String getMmodele() {
	return this.marque;
}
void setModele(String mar) {
	this.modele = mar ;
}

double getPrix() {
	return this.prix;
}
void setPrix(double p) {
	this.prix = p;
}

int getAnnee() {
	return this.annee;
}

int getCount() {
	return this.count;
}

}












