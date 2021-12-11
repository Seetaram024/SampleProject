package com.alpha.session37;

import java.util.Scanner;

public class Student2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student2Constructor[] a=new Student2Constructor[5];
		a[0]=new Student2Constructor("ram",10);
		
		a[1]=new Student2Constructor("sheela",20);
		
		a[2]=new Student2Constructor("laxman",30);
		
		a[3]=new Student2Constructor("manoj",40);
		
		System.out.println("enter id ");
		int id=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i].id==id) {
				System.out.println(a[i].name);
				break;
				}
			     
		}
	}

}
