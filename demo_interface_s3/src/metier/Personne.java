package metier;

import service.ISport;

public class Personne implements ISport {

	@Override
	public void courir() {
		System.out.println("Une personne est en train de courir");
	}

	@Override
	public void nager() {
		System.out.println("Une personne est en train de nager");
	}

}
