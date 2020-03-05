package service;

public class TriathlonServices {
	public static void participerTriathlon(ITriathlete triathlete)
	{
		triathlete.courir();
		triathlete.nager();
		triathlete.pedaler();
	}
}
