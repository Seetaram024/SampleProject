package generic;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverPen {
	public static void main(String[] args) {

		PenArray[] a = { new PenArray("blue", 10), new PenArray("black", 5) };  
		ArrayList<PenArray> a1 = new ArrayList<>(Arrays.asList(a));

		for (PenArray p : a1) {
			if (p.color.equals("blue")) {
				System.out.println(p.price);
			}
		}
	}
}
