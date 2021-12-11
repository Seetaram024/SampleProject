package thread6;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		Movie m=new Movie("KGF",2020);
		Reader r=new Reader(m,"E:/Movie/A.txt");
	
		r.start();
		
		Writer w=new Writer(m,"hebbuli");
		w.start();
		Reader r1=new Reader(m,"E:/Movie/B.txt");
		r1.start();
		Thread.sleep(2000);
	
	}

}
