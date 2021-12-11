package com.alpha.session48;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		PrintWriter fos=new PrintWriter("C:/Users/seetaram/com.Abc.text");
	try {
		System.out.println("enter a name");
		String name=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		fos.println(name);
		fos.println("..................");
		fos.println(id);
		fos.println("......................");
	}
	//	fos.write(cno);
	//fos.flush();
		catch( FileNotFoundException e  )
		{
			System.out.println("asdf");
		}
		
	}

}
