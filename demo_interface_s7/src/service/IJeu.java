package service;

public interface IJeu {
	public void jouer();
	
	default public void etreAddict()
	{
		System.out.println("Vous êtes maintenant addict.");
	}
}
