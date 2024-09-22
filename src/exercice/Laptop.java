package exercice;

public class Laptop extends Ordinateur {

	private double autonomie;

	public double getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(double autonomie) {
		this.autonomie = autonomie;
	}

	public Laptop(String processeur, int ram, String marque, double prix, String carte, double autonomie) {
		super(processeur, ram, marque, prix, carte);
		this.autonomie = autonomie;
	}

	@Override
	public String toString() {
		return "Laptop [autonomie=" + autonomie + ", Ordinateur=" + super.toString() + "]";
	}
	
	
}
