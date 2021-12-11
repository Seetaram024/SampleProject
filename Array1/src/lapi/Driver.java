package lapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Driver  {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Laptop> list=new ArrayList();
		System.out.println("please enter brand name");
		System.out.println("please enter ram ");
		System.out.println("please enter price ");
		for(int i=0;i<3;i++)
		{
			String brand=sc.next();
			int ram=sc.nextInt();
			int price=sc.nextInt();
			list.add(new Laptop(brand,ram,price));
		}
		
		
		//using anonymous function
		Collections.sort(list,(l1,l2) ->
		{
			if(l1.getPrice()>l2.getPrice())
				return 1;
			else
				return -1;
		});
		
		
		for(Laptop lap:list)
		{
			System.out.println(lap);
		}

	}

}
