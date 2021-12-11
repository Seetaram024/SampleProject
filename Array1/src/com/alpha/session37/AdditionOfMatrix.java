package com.alpha.session37;

import java.util.Scanner;

public class AdditionOfMatrix {
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
		Scanner sc=new Scanner(System.in);

		System.out.println("enter rows");
		int row1=s.nextInt();
		System.out.println("enter columns");
		int col1=s.nextInt();
		int [][]b=new int[row1][col1];
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++) {
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int addMatrix[][]=new int[row][col];
		System.out.println("the addition of two matrix :");
		if(row==row1 && col==col1) {
			for (int i = 0; i < row1; i++) {
				for(int j=0;j<col1;j++) {
					addMatrix[i][j]=a[i][j]+b[i][j];
				}
			}
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(addMatrix[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		else
		{
			System.out.println("not possible");
		}					
	}			
}

