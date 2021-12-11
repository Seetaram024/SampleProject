package threading;

public class CustomThread extends Thread{
	public CustomThread(String c) {
		super(c);
	}

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+ getName());
		}
	}
	

}
