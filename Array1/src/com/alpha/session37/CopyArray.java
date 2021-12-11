package com.alpha.session37;

public class CopyArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,11,8,67,56};
		int[] b=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
			
		}
		for (int i = 0; i < b.length; i++) {
		
		System.out.println(b[i]+" ");
		}
	}
}
