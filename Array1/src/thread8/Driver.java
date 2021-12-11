package thread8;

public class Driver {

	public static void main(String[] args) {
		Box b=new Box();
		Producer p=new Producer(b,10,"Producer");
		Consumer c=new Consumer(b,6,"Consumer");
		p.start();
		c.start();
	}

}
