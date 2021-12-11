package thread4;

import thread3.Table1;

public class Driver {

	public static void main(String[] args) {
		Book b=new Book("lucia");

		Reader b1=new Reader(b,"E:/10 g/ab1.txt");
		Reader b2=new Reader(b,"E:/10 g/ab2.txt");
		b1.start();
		b2.start();

	
	}

}
