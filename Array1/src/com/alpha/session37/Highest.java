package com.alpha.session37;

public class Highest {
	public static void main(String[] args) {
int[]arr=new int[]{2,11,8,67,56};
int max=arr[0];
for (int i = 0; i < arr.length; i++) 
{
	if(arr[i]>max)
		max=arr[i];
}
System.out.println(max);
	
}	
}
