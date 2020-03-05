package metier;

import service.ISport;

public class Fatimata implements ISport {

	@Override
	public void courir()
	{
		System.out.println("Appel de la fonction COURIR de Fatimata");
	}
	
	@Override
	public void nager()
	{
		System.out.println("NAAAAAGEEEEER");
	}
}
