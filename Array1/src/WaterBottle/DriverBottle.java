package WaterBottle;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverBottle
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList a1=new ArrayList();
		System.out.println("enter no. of water bottles");
		int size=sc.nextInt();

		System.out.println("enter colour and capacity");
		for(int i=0;i<size;i++)
		{
			String col=sc.next();
			int cap=sc.nextInt();

			a1.add(new Water(col,cap));
		}
		for(int i=0;i<size;i++)
		{
			Object o=a1.get(i);
			Water w1=(Water)o;
			System.out.println(w1.col);
		}

	}
  }


