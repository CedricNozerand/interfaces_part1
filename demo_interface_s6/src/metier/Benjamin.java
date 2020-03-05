package metier;

import service.ISport;

public class Benjamin implements ISport {

	@Override
	public void courir()
	{
		System.out.println("Appel de la fonction COURIR de Benjamin");
	}
}
