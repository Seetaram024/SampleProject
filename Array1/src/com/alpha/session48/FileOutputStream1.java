package com.alpha.session48;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("C:/Users/seetaram/com.Abc.text");
	byte b[]= {60,20,67};
	fos.write(b);
	}

}
