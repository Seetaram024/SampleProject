package com.alpha.eb2.session39;

import java.util.Scanner;

public class MultiDimensionArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int row=s.nextInt();
		System.out.println("enter columns");
		int col=s.nextInt();
		int [][]a=new int[row][col];
		for(int i=0;i<row;i++)
		{
			Scanner sc=new Scanner(System.in);
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}