package WaterBottle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DriverEmployee {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			ArrayList a11=new ArrayList();
			System.out.println("enter no. of employees");
			int size=sc.nextInt();
			
			System.out.println("enter name and id ");
			for(int i=0;i<size;i++)
			{
				String name=sc.next();
				int id=sc.nextInt();
				a11.add(new Employee(name,id));
			}
			
			Iterator itr=a11.iterator();
			while(itr.hasNext())
			{
				Employee e=(Employee)itr.next();
				System.out.println(e.name);	
			}
			
		}

	}


