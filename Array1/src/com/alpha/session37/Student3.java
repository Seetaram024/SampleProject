package com.alpha.session37;
import java.util.Arrays;
import java.util.Scanner;

public class Student3 {
	public static void main(String[] args) {
		
		Student3Constructor[] a=new Student3Constructor[3];
		
		for(int i=0;i<a.length;i++) 
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter id");
			int id=sc.nextInt();
			a[i]=new Student3Constructor(name,id); 
		}
		
		int max=a[0].id;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i].id>max)
				max=a[i].id;
		}
		for(int i=0;i<a.length;i++) {
		
			if(a[i].id==max) {
				System.out.println(a[i].name+" has largest id");
				break;
				}
			     
		}
	}
}
