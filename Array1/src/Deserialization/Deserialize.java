package Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis=new FileInputStream("C:/Users/seetaram/com/alpha/Serial.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	Student s1=(Student)ois.readObject();
	Student s2=(Student)ois.readObject();
	
	System.out.println(s1.sname);
	System.out.println(s1.id);
	System.out.println(s2.sname);
	System.out.println(s2.id);
	

	}

}
