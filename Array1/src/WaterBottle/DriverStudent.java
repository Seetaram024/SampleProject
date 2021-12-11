package WaterBottle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DriverStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList a11=new ArrayList();
		System.out.println("enter no. of employees");
		int size=sc.nextInt();
		
		System.out.println("enter name and id ");
		for(int i=0;i<size;i++)
		{
			String name=sc.next();
			int id=sc.nextInt();
			a11.add(new Student(name,id));
		}
		
		Iterator itr=a11.iterator();
		while(itr.hasNext())
		{
			Student s=(Student)itr.next();
			if(s.id==5) {
			System.out.println(s.student);	
			}
		}
		
	}
	}


