package WaterBottle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
String name;
int id;
public Employee(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
 public String toString(Object o1)
{
	return this.name+"\n"+ this.id;
} 
}

