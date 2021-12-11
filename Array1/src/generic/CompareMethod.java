package generic;

import java.util.ArrayList;
import java.util.Collections;

public class CompareMethod {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(new Student1("A",1));
	a1.add(new Student1("B",3));
	a1.add(new Student1("C",5));
	a1.add(new Student1("D",2));
	System.out.println("before sort");
	System.out.println(a1);
//	Collections.sort(a1);
//	System.out.println("after sorting by id");
//	System.out.println(a1);
	Collections.sort(a1,new SortByName());
	System.out.println("after sort by name");
	System.out.println(a1);
}
}
