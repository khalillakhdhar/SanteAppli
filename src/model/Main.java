package model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Personne p1=new Personne("p1", "pr1", 20);
	System.out.println(p1.toString());
	Personne.personnes.add(p1);

	Personne p2=new Personne("p2", "pr2", 70);
	System.out.println(p1.toString());
	Personne.personnes.add(p2);
	for(Personne p:Personne.personnes)
	{
		System.out.println(p.toString());
	}

	}

}
