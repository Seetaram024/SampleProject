package FileHandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:/Users/seetaram/File.txt");
		int i=fis.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fis.read();
		}
	}

}
