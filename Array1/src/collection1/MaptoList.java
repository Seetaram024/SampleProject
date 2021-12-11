package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MaptoList {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter no. of objects");
		int n=sc1.nextInt();
		m1(n);
		System.out.println();
		
	}
	
	
	public static void m1(int n)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,StudentObjects> hm=new HashMap();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next(); 
			hm.put(id,new StudentObjects(id,name));
		}
		arrayList1(hm);
	}
	
	public static void arrayList1(HashMap<Integer, StudentObjects> hm  )
	{
		ArrayList a1=new ArrayList();
		Set <Integer> ss=hm.keySet();
		for(Integer s:ss)
		{
			a1.add(hm.get(s));
		}
		System.out.println(a1);
	}
}

