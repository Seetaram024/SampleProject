package thread7;

public class Res2 {
public synchronized void n1(Res1 o1) {
	System.out.println(Thread.currentThread().getName()+"   under execution");
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	o1.m2();
}
public synchronized void n2() {
System.out.println("job done....!");
}
}