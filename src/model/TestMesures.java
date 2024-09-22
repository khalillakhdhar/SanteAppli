package model;

public class TestMesures {
public static void main(String args[])
{
	Imc imc=new Imc("indice", 1.83, 80);
	System.out.println(imc.toString());
	Pression pression=new Pression("tension", 120, 70);
	System.out.println(pression.toString());
}
}
