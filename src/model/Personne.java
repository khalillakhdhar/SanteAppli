package model;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	public static int id=0; // id garde sa derniére valeur
	// id est accessible indépendement du constructeur
	private String nom;
	private String prenom;
	private int age;
	public static List<Personne> personnes=new ArrayList<Personne>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Personne( String nom, String prenom, int age) {
		super();
		id++;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Personne() {
		
		super();
		id++;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ",nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}


}
