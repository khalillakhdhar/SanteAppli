package exercice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop=new Laptop("i7", 32, "asus", 4000, "nvidea gforce", 160);
		System.out.println(laptop.toString());
		Produit p=new Produit("Dell", 2000, 30, "locale");
		System.out.println(p.toString());
	}

}
