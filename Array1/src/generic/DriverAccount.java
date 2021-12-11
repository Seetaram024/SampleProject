package generic;

import java.util.Scanner;


import java.util.HashSet;
import java.util.Scanner;

public class DriverAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<Account> hs=new HashSet<Account>();
		Bank b=new Bank();
		System.out.println("Enter initial number of account you want to add ?");
		int size=sc.nextInt();
		for (int i = 0; i < size; i++) 
		{
			System.out.println("Enter Name ");
			String name=sc.next();
			System.out.println("Enter account num");
			long accnum=sc.nextLong();
			System.out.println("Enter password");
			String pass=sc.next();
			System.out.println("Enter balance");
			double bal=sc.nextDouble();
			hs.add(new Account(name,accnum, pass, bal));
			
		}
		
		for(;;)
		{
			System.out.println("1.create account\n2.Withdraw\n3.Deposit\n4.show details\n5.exit");
			System.out.println("Enter your choice   !!");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:System.out.println("Enter Name ");
				String name1=sc.next();
				System.out.println("Enter account num");
				long accnum1=sc.nextLong();
				System.out.println("Enter password");
				String pass3=sc.next();
				System.out.println("Enter balance");
				double bal1=sc.nextDouble();
				b.createAcc(hs,new Account(name1,accnum1, pass3, bal1)  );
				break;
			case 2:System.out.println("Enter password");
					String pass1=sc.next();
					b.withdraw(hs, pass1);
				break;
			case 3:System.out.println("Enter password");
					String pass=sc.next(); 
					b.deposit(hs, pass);			
				break;
			case 4:;System.out.println("Enter password");
					String pas=sc.next();
					b.print(hs, pas);
				break;
			case 5:System.exit(0);
				
			default:System.out.println("you entered wrong choice !");
				break;
			}
		}

	}

}
