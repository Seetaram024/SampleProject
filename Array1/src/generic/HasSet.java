package generic;

import java.util.Collections;
import java.util.HashSet;

import com.alpha.session37.Student;

public class HasSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Student1("manoj",1));
		hs.add(new Student1("seetaram",2));
		hs.add(new Student1("manoj1",3));
		hs.add(new Student1("seetaram1",4));
		hs.add(new Student1("manoj",1));
		hs.add(new Student1("seetaram",2));
		hs.add(new Student1("seetaram1",4));
	//	System.out.println(Collections.sort);   	# we cannot sort HashSet 

	}

}
