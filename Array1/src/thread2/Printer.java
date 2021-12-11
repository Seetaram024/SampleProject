package thread2;

public class Printer extends Thread {
	int m,n;
	Printer(int m,int n,String s)
	{
	this.m=m;
	this.n=n;
	}
public void run()
{
	
	for(int i=m;i<=n;i++)
	{
		System.out.println(i+ getName());
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
