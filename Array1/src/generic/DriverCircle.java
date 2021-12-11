package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		ArrayList<Circle> a1=new ArrayList<>();
	
		a1.add(new Circle(10,20));
		a1.add(new Circle(20,40));
		
		for(Circle c : a1)
		{
			System.out.println(c.rad);
		}
	}
}
