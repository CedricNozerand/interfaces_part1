package presentation;

import metier.Benjamin;
import metier.Fatimata;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benjamin benjamin = new Benjamin();
		Fatimata fatimata = new Fatimata();
		
		System.out.println("DEMO AVEC INTERFACE");
		
		benjamin.courir();
		benjamin.nager();
		fatimata.courir();
		fatimata.nager();
	}

}
