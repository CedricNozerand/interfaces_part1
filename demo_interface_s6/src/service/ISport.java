package service;

public interface ISport {
	public void courir();
	
	default public void nager()
	{
		System.out.println("Appel par d�faut de la m�thode NAGER");
	}
}
