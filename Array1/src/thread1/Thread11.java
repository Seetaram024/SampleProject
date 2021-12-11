package thread1;

import java.util.Scanner;

public class Thread11 {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter delay time");
		int delay=sc.nextInt();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(".............................................");
		for(char i='a';i<='z';i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


	}


