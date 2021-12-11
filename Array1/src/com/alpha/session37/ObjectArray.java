package com.alpha.session37;

import java.util.Scanner;

public class ObjectArray {

	public static void main(String[] args) {
		Student1 
	Scanner sc=new Scanner(System.in);
	Student1 []a=new Student1[5];
	for(int i=0;i<a.length-1;i++) {
		 System.out.println("enter"+(i+1)+"student name");
		 String  sname=sc.next();
		 System.out.println("enter "+sname+ " id");
		 int sid=sc.nextInt();
		 a[i]=new Student1(sname,sid);
		 System.out.println(a[i].sname);
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i].sname+ " "+a[i].sid);
	}

	}

}
