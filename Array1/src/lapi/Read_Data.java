package lapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_Data {

	public static void main(String[] args) throws FileNotFoundException {
	String filepath="./TestData/Demo.xlsx";
	File file=new File(filepath);
	FileInputStream  fis=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(fis);
	
	}

}
