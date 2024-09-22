package model;

public class Pression extends Mesure{
private int mini;
private int maxi;
	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		if((mini<50 || mini >120)|| (maxi<60 || maxi>240))
		return 0;
		else
		{
			double valeur=(maxi/10)+(mini/100);
			return valeur;
		}
	}

	@Override
	public String remarques() {
		// TODO Auto-generated method stub
		if(mini>=90|| maxi>=120)
		return "hypertension";
		else if(calculer()<10.6)
			return "hypotension";
			else
				return "idéale";
	}

	public Pression(String type, int mini, int maxi) {
		super(type);
		this.mini = mini;
		this.maxi = maxi;
	}

	@Override
	public String toString() {
		return "Pression [mini=" + mini + ", maxi=" + maxi + ", toString()=" + super.toString() + "]";
	}

}
