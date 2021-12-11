package tableThread;

import java.util.Scanner;

public class DriverTable {

	public static void main(String[] args) {
		System.out.println("mainstart");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number ");
		int t=sc.nextInt();
		Table t1=new Table(t,"  thread -1");
		Table t2=new Table(t,"  thread -2");
		t1.start();
		t2.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
System.out.println("main end");
	}

}
 