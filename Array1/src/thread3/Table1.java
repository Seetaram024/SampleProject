package thread3;

import java.io.IOException;
import java.io.PrintWriter;

public class Table1 extends Thread {
	int m;
	String file_path;
	public Table1(int m, String file_path) {
		super();
		this.m = m;
		this.file_path = file_path;
	}
	public void run()
	{
		PrintWriter pw=null;
		
		try 
		{
			pw=new PrintWriter(file_path);

			for(int i=1;i<=10;i++)
			{
				pw.println("10 * "+i+" = "+(10*i));
				Thread.sleep(400);
			}
		}
		catch(InterruptedException e1) 
		{
				System.out.println("exception occured in "+getName());
				System.out.println("thread get inturrupted");
			}
		catch(IOException e)
		{
			System.out.println("exception occured in "+getName());
			System.out.println("unable to create file");
			System.out.println("check for path"+file_path);
			System.out.println("====================================================");
		}
		finally
		{
				if(pw!=null) {
					pw.close();
				}
		}
	}

}
