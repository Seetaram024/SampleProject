package collection1;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		
		a2.add(1);
		a2.add(2);
		a2.add(6);
		a2.add(5);
		System.out.println(a1);
		System.out.println(a2);
		
		
	//	a1.remove(a2);
	//	System.out.println(a1);
		
	//a1.removeAll(a2);
	//System.out.println(a1);
		
	a1.remove(a2);
		System.out.println(a1);
	}

}
