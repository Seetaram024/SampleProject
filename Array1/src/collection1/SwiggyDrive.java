package collection1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SwiggyDrive {

	   public static void main(String[] args) throws FileNotFoundException
	   {
		   Swiggy sgg= new Swiggy();
		   Scanner sc1=new Scanner(System.in);
		  System.out.println("Welcome to Swiggy..@");
		  boolean flag=true;
		  System.out.println("select option...!");
		  while(flag)
		  {
				
			  System.out.println("-----------------------------------------------------------");
				System.out.println("1)ChoseHotel\n2)Confirmation\n3)GenericBill\n4)Exit");
				 System.out.println("-----------------------------------------------------------\n");
			    int option=sc1.nextInt();
				switch(option)
				{
					 case 1:
					 {
						 System.out.println("-----------------------------------------------------------");
						System.out.println("\t1)DosaCamp\t2)HotelApna"); 
						int op1=sc1.nextInt();
						System.out.println("enter cont_Number: ");
						long cont_Number=sc1.nextLong();
						sc1.nextLine();
						System.out.println("enter cust_Name: ");
						String cust_Name=sc1.nextLine();
						 System.out.println("-----------------------------------------------------------\n");
						sgg=new Swiggy(cust_Name, cont_Number, op1);
					 }
					 break;
					 case 2:
					 {
						 sgg.conFirmation();
					 }
					 break;
					 case 3:
					 {
						sgg.genericBill();
					 }
					 break;
					 case 4:
					 {
						 System.out.println("Thank You..!");
						 flag=false;
					 }
					 break;
					 default :
					 {
						 System.out.println("select corrct option...!");
					 }
					 
				}
		  } 
	   }
}

