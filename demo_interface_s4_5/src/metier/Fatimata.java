package metier;

import service.IManga;

public class Fatimata extends Personne implements IManga {

	@Override
	public void lireManga() {
		System.out.println("Fatimata lit un manga");
	}

}
