package metier;

import service.IJeu;

public class Benjamin extends Personne implements IJeu {

	@Override
	public void jouer() {
		System.out.println("Benjamin joue");
	}
}
