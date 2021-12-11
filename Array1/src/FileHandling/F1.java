  package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;

public class F1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		Account a=new Account(1234,123,10000);
		PrintWriter fos=new PrintWriter("C:/Users/seetaram/File.txt");
		fos.println("account number is : "+a.aN);
		fos.println("balance is: "+a.bal);
		fos.println("................................................");
		fos.flush();
		boolean flag=true;
		while(flag)
		{
			System.out.println("1)withdraw\n2)deposit");
			int option=sc.nextInt();
			switch(option)
			{
			case 1: 
				System.out.println("enter password");
				int pwd=sc.nextInt();
				System.out.println("enter amount");
				double amount=sc.nextDouble();
			double withStatus=a.withdraw(pwd, amount);
			if(withStatus==1) 
			{
				a.bal-=amount;
				fos.println("account number is : "+a.aN);
				fos.println("balance is: "+a.bal);
				fos.println("................................................");
				fos.flush();
				System.out.println("amount is deducted"+a.bal);
			}
			else if(withStatus==-1)
			{
				System.out.println("password is incorrect");
			}
			else
			{
				System.out.println("insuffiecient balance");
			}
			default : System.out.println();
				
			}
		}

	}

}
