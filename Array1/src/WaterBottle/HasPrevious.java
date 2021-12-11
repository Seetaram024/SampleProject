package WaterBottle;

import java.util.ArrayList;
import java.util.ListIterator;

public class HasPrevious {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		ListIterator li=a1.listIterator(0);
		a1.add(0, "hii");
		System.out.println(li.hasPrevious());
		System.out.println(li.previous());
		System.out.println(a1);

	}

}
