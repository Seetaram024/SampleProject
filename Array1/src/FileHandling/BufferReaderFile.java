package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderFile {

	public static void main(String[] args) throws IOException {
  FileReader fr=new FileReader("C:/Users/seetaram/com/alpha/eb2/session26/src/Account.txt");
  BufferedReader br=new BufferedReader(fr);
  String str=br.readLine();
  int count=0;
  while(str!=null)
  {
	  System.out.println(str);
	  str=br.readLine();
	  count++;
  }
  

	}

}
