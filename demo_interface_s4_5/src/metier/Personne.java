package metier;

import service.ITriathlete;

public class Personne implements ITriathlete {

	@Override
	public void courir() {
		System.out.println("Une personne est en train de courir");
	}

	@Override
	public void nager() {
		System.out.println("Une personne est en train de nager");
	}

	@Override
	public void pedaler() {
		System.out.println("Une personne est en train de pedaler");
	}
}
