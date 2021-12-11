package thread6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import thread5.Book;

public class Movie implements Comparable, Serializable{
private String title;
private int releaseYear;
public Movie(String title, int releaseYear) {
	super();
	this.title = title;
	this.releaseYear = releaseYear;
}

public void readTitleYear(String file_path) 
{
	PrintWriter pw=null;
	try {
		pw=new PrintWriter(file_path);
		//pw.flush();
		synchronized(this) {
		for(int i=0;i<title.length();i++)
		{
			pw.print(title.charAt(i));
			//pw.flush();		
		System.out.println("printing....!!!!");
		Thread.sleep(1000);
		pw.flush();
		}
	}}catch (NullPointerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(pw!=null)
			pw.close();
	}

}



public synchronized void writeTitle(String title)
{
	this.title=title;
}

@Override
public int compareTo(Object o)
{
	Movie m=(Movie)o;
	return this.title.compareTo(m.title);
}
@Override
public String toString()
{
	return "[Movie{title :" + title+ "}"+"[Movie{releaseDate :" + releaseYear+ "}]";
}
@Override
public boolean equals(Object o)
{
	Movie temp=(Movie)o;
	return this.title.equals(temp.title);
}
@Override
public int hashCode()
{
	return this.title.hashCode();
}
}
