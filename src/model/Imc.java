package model;

public class Imc extends Mesure {
private double taille;
private double poids;



	public Imc(String type, double taille, double poids) {
	super(type);
	this.taille = taille;
	this.poids = poids;
}

	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		double imc=poids/(taille*taille);
		
		return  Math.round(imc);
	}

	@Override
	public String remarques() {
		// TODO Auto-generated method stub
		
		if(this.calculer()<20)
			return "maigre";
		else if(this.calculer()<=25)
			return "idéale";
		else
			return "surpoids";
	}

	@Override
	public String toString() {
		return "Imc [taille=" + taille + ", poids=" + poids + ", toString()=" + super.toString() + "]";
	}

}
