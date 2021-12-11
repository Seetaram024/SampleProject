package hashmap1;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(1,new Student1(1, "smith"));
		tm.put(3,new Student1(3, "manoj"));
		tm.put(6,new Student1( 6,"abhi"));
		tm.put(4, new Student1(4, "alan"));
	
		System.out.println(tm);

	}

}
