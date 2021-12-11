package thread1;

public class Thread2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		m1();
		System.out.println(Thread.currentThread().getName());

	}
	public static void m1()
	{
		System.out.println(Thread.currentThread().getName());
	//	System.out.println(Thread.currentThread().getId());
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());

	}

}
