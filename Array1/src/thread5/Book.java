package thread5;

import java.io.Serializable;

import java.io.IOException;
import java.io.PrintWriter;

public class Book implements Comparable,Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String title;

//to read title and store into file

	public void readTitle(String file_path)
	{
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(file_path);
			for(int i=0;i<title.length();i++) {
				pw.flush();
				pw.print(title.charAt(i));
				System.out.println("printing...!!");
				Thread.sleep(2000);
			}
			System.out.println("done......!!");
			}
		catch(IOException e) {
			System.out.println("exception in thread");
			System.out.println("unable to open....  "+Thread.currentThread().getName());
		}
		catch(InterruptedException e) {
			System.out.println("exception in thread");
			System.out.println("unable to open....  "+Thread.currentThread().getName());
		}
		finally {
			if(pw!=null)
				pw.close();
		}
	 
}
	// end of print title method
	
	public void writeTitle(String title)
	{
		this.title=title;
	}
	
	@Override
	public int compareTo(Object o)
	{
		return this.title.compareTo(((Book)o).title);
	}
	@Override
	public String toString()
	{
		return "[book{title :" + title+ "}]";
	}
	@Override
	public boolean equals(Object o)
	{
		Book temp=(Book)o;
		return this.title.equals(temp.title);
	}
	@Override
	public int hashCode()
	{
		return this.title.hashCode();
	}

}
