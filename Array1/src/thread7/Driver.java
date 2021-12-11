package thread7;

public class Driver {

	public static void main(String[] args) {
		Res1 o1=new Res1();
		Res2 o2=new Res2();

		Thread t1=new Thread(() ->o1.m1(o2));
		Thread t2=new Thread(() ->o2.n1(o1));
		t1.start();
		t2.start();

	}

}
 