package thread4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Reader extends Thread  {
Book b;
String path_file;
public Reader(Book b, String path_file) 
{
	super();
	this.b = b;
	this.path_file = path_file;
}
public void run()
{
	PrintWriter pr=null;
	try
	{
		pr=new PrintWriter(path_file); 
		for(int i=0;i<b.title.length();i++)
		{
			pr.print(b.title.charAt(i));
			Thread.sleep(2000);
			System.out.println("printing   ");
			pr.flush();
			
		}
	}
	catch( FileNotFoundException |  InterruptedException    e  )
	{
		e.printStackTrace();
	}
	finally {
		if(pr!=null)
			pr.close();
	}
}
}
