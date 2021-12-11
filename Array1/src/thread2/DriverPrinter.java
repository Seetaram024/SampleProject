package thread2;

public class DriverPrinter {

	public static void main(String[] args) {
		int m=1,n=5;
		Printer p1=new Printer(m,n,"t-1");
		Printer p2=new Printer(m,n,"t-2");

		p1.start();
		p2.start();
	}

}
