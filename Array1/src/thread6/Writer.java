package thread6;

public class Writer extends Thread {
	Movie m;
	String title;
	
	public Writer(Movie m, String title) {
		super();
		this.m = m;
		this.title = title;
	}

	public void run()
	{
		m.writeTitle(title);
	}

}
