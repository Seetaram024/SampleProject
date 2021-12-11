package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class MainStudentObject {

	public static void main(String[] args) {
		

	
	
	HashMap hm=new HashMap();
	for(StudentObjects s: )
	{
		Collection a1=(Collection) hm.put(s.id, s.name) ;
	System.out.println(a1);
	
	}
	}
	
	public static Collection m1()
	{
		ArrayList<StudentObjects> a=new ArrayList<StudentObjects>();
		a.add(new StudentObjects(1,"ram"));
		a.add(new StudentObjects(2,"laxman"));
		a.add(new StudentObjects(3,"ravan"));
		
		return a;
		
	}

}
