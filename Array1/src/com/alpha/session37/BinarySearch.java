package com.alpha.session37;

public class BinarySearch {

	public static void main(String[] args) {
		int []arr= {3,4,5,10,45,90};
		int key=10;
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("element is found");
				return;
			}
			else if(key>arr[mid])
				low=mid+1;
			else
				low=mid-1;
		}
		System.out.println("element not found");
	}

}
