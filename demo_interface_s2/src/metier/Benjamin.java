package metier;

import service.Isport;

public class Benjamin implements Isport {

	@Override
	public void courir()
	{
		System.out.println("Appel de la fonction COURIR de Benjamin");
	}
	
	@Override
	public void nager()
	{
		System.out.println("Appel de la fonction NAGER de Benjamin");
	}
}
