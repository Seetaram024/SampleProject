package generic;

public class Student1 {
String name;
int id;
public Student1(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString()
{
	return name;
}
public int compareTo(Object o)
{
	Student1 s=(Student1)o;
	if(this.id==(s.id))
		return  0;
	else if(this.id>s.id)
		return 1;
	else
		return -1;
}
}
