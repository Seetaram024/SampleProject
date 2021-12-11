package thread8;

public class Consumer extends Thread{
	Box b;
	int n;
	public Consumer(Box b, int n,String name) {
		super();
		this.b = b;
		this.n = n;
	}

	public void run()
	{
		b.removeBiscuit(n);
		System.out.println(getName()+ "  successfully consumed"+n+ " biscuits");
	}
}
