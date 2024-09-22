package exercice;

public class Produit {
private String marque;
private double prix;
private int quantite;
private String type;
public Produit(String marque, double prix, int quantite, String type) {
	super();
	this.marque = marque;
	this.prix = prix;
	this.quantite = quantite;
	this.type = type;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public double calculerTaxe()
{
	double totale=prix*quantite;
double taxe=totale*0.10;
if(type.equals("importé"))
	taxe+=totale*0.02;
if(quantite>20)
{
taxe+=totale*0.05;

}
if(prix>1000)
	taxe+=totale*0.03;

return taxe;
}
@Override
public String toString() {
	return "Produit [marque=" + marque + ", prix=" + prix + ", quantite=" + quantite + ", type=" + type
			+ ", calculerTaxe()=" + calculerTaxe() + "]";
}



}
