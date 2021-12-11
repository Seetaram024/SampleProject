package thread6;

public class Reader extends Thread {
	Movie m;
	String file_path;
	public Reader(Movie m, String file_path) {
		super();
		this.m = m;
		this.file_path = file_path;
	}
	public void run() {
				
					m.readTitleYear(file_path);
				
			
	}
}
