package thread8;

public class Producer extends Thread {
	int max_limit;
	Box b;

	public Producer(Box b,int max_limit,String name) {
		super(name);
		this.max_limit = max_limit;
		this.b=b;

		
	}
	public void run() {
		while(max_limit>0)
		{
			b.addBiscuits(5);
			max_limit-=5;
			try {
				sleep(1000);
			}catch(  InterruptedException e ) {
				System.out.println("inturrupted.......");
			}
		}
		System.out.println(getName()+ " done for the day");
	}
	
}
