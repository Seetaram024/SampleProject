package generic;



import java.util.*;

public class Bank {
	private String Bank="SBI";
	private String manager="Priyadarshan";
	public String getBank() {
		return Bank;
	}
	static	Scanner sc=new Scanner(System.in);
	
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public void createAcc(HashSet h,Account ac)
	{
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			Account ac1=(Account)itr.next();
			if(ac1.Accnum==ac.Accnum)
				{
					System.out.println(ac.Accnum+"  Account num exists in databse !!");
					break;
				}else {
					h.add(ac);
					System.out.println("Account created #");
				}
			
		}
		
	}
	public void withdraw(HashSet h,String Password)
	{
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
		Account ac1=(Account)itr.next();
		if(ac1.password.equals(Password))
			{
				System.out.println("Enter amount !");
				double amount=sc.nextDouble();
				if(amount<ac1.getBalance())
				{
					ac1.setBalance(ac1.getBalance()-amount);
					System.out.println("balance debited :)");
				}else {
					System.out.println("Amount is greater than balance !");
				}
		
			}
		}
	}
	
	public void deposit(HashSet h,String Password)
	{
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
		Account ac1=(Account)itr.next();
		if(ac1.password.equals(Password))
			{
				System.out.println("Enter amount !");
				double amount=sc.nextDouble();
				
				ac1.setBalance(amount+ac1.getBalance());
				System.out.println("balance creited !");
				
				return;
			}
		}
		System.out.println("no data present");
	}
	public void print(HashSet h,String Password)
	{
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
		Account ac1=(Account)itr.next();
		if(ac1.password.equals(Password))
			{
				System.out.println(ac1);
				return ;
		
			}
		}
		System.out.println("no data present !");
	}
	

}

