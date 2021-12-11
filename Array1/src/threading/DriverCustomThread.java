package threading;

public class DriverCustomThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main starts");
		CustomThread t1=new CustomThread(" thread-1");
		CustomThread t2=new CustomThread(" thread-2");
		CustomThread t3=new CustomThread(" thread-3");

		t1.start();
		//Thread.sleep(9000);
		t2.start();
		//Thread.sleep(9000);
		t3.start();
		//Thread.sleep(9000);
	}

}
