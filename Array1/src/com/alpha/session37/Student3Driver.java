package com.alpha.session37;

import java.util.Arrays;
import java.util.Scanner;



public class Student3Driver {
public static void main(String[] args) {
	Student3Constructor[] a=new Student3Constructor[3];
	for(int i=0;i<a.length;i++) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println(" enter cno");
		int cno=sc.nextInt();
		
		a[i]=new Student3Constructor(name,id,cno); 
	}
	Arrays.sort(a, new ComparatorStudent());
	for(int i=0;a.length;i++) {
		System.out.println(a[i]);
	}
	
	}
}
