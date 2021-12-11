package collection1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Lap {
	public static void main(String[] args) {
		
	
	String array[] = { "Golf", "Soccer", "Baseball", "Volleyball", "Tennis", "Badminton", "Rugby", "Archery", "Skiing"};   
	//System.out.println(Arrays.toString(array));   

	Set list = (Set) Arrays.asList(array);  
	System.out.println(list);

	}
}
