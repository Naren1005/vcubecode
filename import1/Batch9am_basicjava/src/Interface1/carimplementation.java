package Interface1;

public interface carimplementation {

	void color();
	void musicsystem();
	void lcdscreen();
	void tyres();
	void sunroof();
	default void luggage()
	{
		System.out.println("luggage carrier ");
		comm();
	}
	static void foglights()
	{
		System.out.println("car fog lights");
		comm();
	}
	private static void comm()
	{
		System.out.println("commoncode");
	}
}
