package com.alpha.session37;

import java.util.Scanner;

public class ChechUserEnter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a int number");
		int userValue=s.nextInt();
		int []a= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length-1;i++) {
			
			if(userValue==a[i]) {
				System.out.println(userValue+" at pisition : "+i);
			System.exit(0);
		}}
		System.out.println("not a member of array");
	}

}
