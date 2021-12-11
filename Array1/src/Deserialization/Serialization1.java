package Deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization1 {

	public static void main(String[] args) throws IOException {
		Student s1=new Student("ram",123);
		Student s2=new Student("sheela",321);
		
		FileOutputStream fos=new FileOutputStream("C:/Users/seetaram/com/alpha/Serial.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		System.out.println(s1.sname);
		System.out.println(s1.id);
		
		System.out.println(s2.sname); 
		System.out.println(s2.id);
		

	}

}
