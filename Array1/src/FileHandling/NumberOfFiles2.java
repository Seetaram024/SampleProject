package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class NumberOfFiles2 {

	
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
