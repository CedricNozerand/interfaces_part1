package service;

public interface ISport {
	public void courir();
	
	default public void nager()
	{
		System.out.println("Appel par défaut de la méthode NAGER");
	}
}
