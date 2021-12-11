package tableThread;

public class Table extends Thread {
	int t;

	public Table(int t,String s) {
		super();
		this.t = t;
	}

	public void run()
	{
		for(int i=1;i<t;i++)
		{
			System.out.println(t+" * "+i+" = "+(t*i)+"    "+ getName());
			
			
		}
	}
}
