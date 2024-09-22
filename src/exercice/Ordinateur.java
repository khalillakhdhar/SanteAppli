package exercice;

public class Ordinateur {
	private String processeur;
	private int ram;
	private String marque;
	private double prix;
	private String carte;
	public String getProcesseur() {
		return processeur;
	}
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
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
	public String getCarte() {
		return carte;
	}
	public void setCarte(String carte) {
		this.carte = carte;
	}
	@Override
	public String toString() {
		return "Ordinateur [processeur=" + processeur + ", ram=" + ram + ", marque=" + marque + ", prix=" + prix
				+ ", carte=" + carte + "]";
	}
	public Ordinateur(String processeur, int ram, String marque, double prix, String carte) {
		super();
		this.processeur = processeur;
		this.ram = ram;
		this.marque = marque;
		this.prix = prix;
		this.carte = carte;
	}
	

}
