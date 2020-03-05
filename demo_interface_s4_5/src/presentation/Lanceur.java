package presentation;

import metier.Benjamin;
import metier.Cedric;
import metier.Fatimata;
import service.TriathlonServices;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benjamin benjamin = new Benjamin();
		Fatimata fatimata = new Fatimata();
		Cedric cedric = new Cedric();
		
		System.out.println("DEMO AVEC INTERFACES");

		TriathlonServices.participerTriathlon(benjamin);
		TriathlonServices.participerTriathlon(fatimata);
		//TriathlonServices.participerTriathlon(cedric);
	}

}
