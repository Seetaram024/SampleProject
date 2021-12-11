package thread8;

import java.util.ArrayList;

public class Box {
	ArrayList<Biscuit> box=new ArrayList<>();

	//add biscuits into box
	public void addBiscuits(int n)
	{
		synchronized(this) 
		{
			for(int i=0;i<n;i++)
			{
				box.add(new Biscuit());
				System.out.println("biscuits added...by "+Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e)
				{
					System.out.println("inturrupted...!");
				}
				this.notify();
			}
		}// end of synchronized
	}


	//to remove biscuits from the box
	public void removeBiscuit(int n)
	{
		while(n!=0)
		{
			if(box.size()==0) {
				try {
					this.wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			else 
			{
				box.remove(0);
				System.out.println("biscuit removed by ");
				n--;
			}
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println("inturrupted...");
			}



		}
	}
}
