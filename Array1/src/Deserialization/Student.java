package Deserialization;

import java.io.Serializable;

public class Student implements Serializable
{
zstatic final long serialversionUID=123L;
String sname;
int id;
public Student(String sname, int id) 
{
	super();
	this.sname = sname;
	this.id = id;
}
}
