package thread7;

public class Res1  {
public synchronized void m1(Res2 o2)
{
	System.out.println(Thread.currentThread().getName()+"  under execution...!!");
	try {
		Thread.sleep(1000);
	}catch( InterruptedException e)
	{
		e.printStackTrace();
	}
	o2.n2();

}
public synchronized void m2()
{
	System.out.println("job is done");
}
}
