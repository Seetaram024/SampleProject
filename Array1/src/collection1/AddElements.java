package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddElements implements Comparable
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	//	List a1=new ArrayList(10);
		List<Lap> a1=new ArrayList<Lap>();

		for(int i=0;i<2;i++) {
			System.out.println("enter m");


			String m=sc.next();
			System.out.println("enter  r");

			int r=sc.nextInt();
			
			a1.add(new Lap(m,r));
		}
		Collections.sort();
	for(Lap l: a1) {
		System.out.println(l);
	}
	}

}
