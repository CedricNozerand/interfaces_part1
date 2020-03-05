package metier;

import service.IJeu;
import service.ISport;

public class Benjamin extends Personne implements IJeu {

	public Benjamin()
	{
		ISport.direBonjour();
	}
	
	@Override
	public void jouer() {
		System.out.println("Benjamin joue");
	}
}
