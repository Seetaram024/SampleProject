package collection1;

	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.PrintWriter;
	import java.util.Date;


	public class Swiggy
	{

		   String cust_Name;
		   long cont_Number;
		   DosaCamp dCamp;
		   HotelApna hApna;
		   int temp=0;
		   public Swiggy()
		   {
			   
		   }
		   public Swiggy(String cust_Name, long cont_Number,int option)
		   {
			super();
			this.cust_Name = cust_Name;
			this.cont_Number = cont_Number;
			choseHotel(option);
		   }
	        
		   public void choseHotel(int option)
		   {
			 if(option==1)
			 {
				 dCamp=new DosaCamp();
				 System.out.println(dCamp.getHotelName());
				 dCamp.menuCar();
			 }
			 else if(option==2)
			 {
				 hApna=new HotelApna();
				 System.out.println(hApna.getHotelName());
				 hApna.menuCar();
			 }
			 else
				 System.out.println("plz select correct hotel option...!");
		   }
		   
		   FileOutputStream ref;
		   PrintWriter pw;
		   public void genericBill() throws FileNotFoundException
		   {
			  
			   if(this.dCamp!=null && temp==1 )
			   {
				   ref=new FileOutputStream("D:/batch2/com/alpha/eb2/CampDosa.txt",true);
				   pw=new PrintWriter(ref);
				 
				   pw.println("\n---------------"+dCamp.getHotelName()+"----------------------------");
				   pw.println("cust_Name: "+cust_Name);
				   pw.println("cont_Number: "+cont_Number);
				   pw.println("-----------------------------------------------------------\n");
				   pw.println("Date:\n     "+new Date());
				   pw.println("FOODNAME\tTOTALQUANTITY\t\tPRICEPERPLATE");
				   pw.println("Dosa: \t\t"+dCamp.totalDosa+"\t\t\t-40");
				   pw.println("Idaly: \t\t"+dCamp.totalIdaly+"\t\t\t-20");
				   pw.println("Meal: \t\t"+dCamp.totalMeal+"\t\t\t-60");
				   pw.println("Puri: \t\t"+dCamp.totalPuri+"\t\t\t-40");
				   pw.println("Billa amount: "+DosaCamp.totalPrice);
				   double x=(DosaCamp.totalPrice*0.05);
				   pw.println("5% GST: "+x);
				   pw.println("PymentAmount: "+(DosaCamp.totalPrice+x));
				   pw.println("-----------------------------------------------------------");
				   pw.flush();
				   System.out.println("Bill download done..");
			   }
			   else if(this.hApna!=null && temp==1)
			   {
				   ref=new FileOutputStream("D:/batch2/com/alpha/eb2/HotelApna.txt",true);
				   pw=new PrintWriter(ref);
				   pw.println("\n---------------"+hApna.getHotelName()+"---------------------------");
				   pw.println("cust_Name: "+cust_Name);
				   pw.println("cont_Number: "+cont_Number);
				   pw.println("-----------------------------------------------------------\n");
				   pw.println("Date:\n     "+new Date());
				   pw.println("FOODNAME\tTOTALQUANTITY\t\tPRICEPERPLATE");
				   pw.println("biryani: \t"+hApna.totalBiryani+"\t\t\t-150");
				   pw.println("chiken: \t"+hApna.totalChiken+"\t\t\t-120");
				   pw.println("muton: \t\t"+hApna.totalMuton+"\t\t\t-160");
				   pw.println("chikenCurry: \t"+hApna.totalChikenCurry+"\t\t\t-180");
				   pw.println("Billa amount: "+HotelApna.totalPrice);
				   double x=(HotelApna.totalPrice*0.05);
				   pw.println("5% GST: "+x);
				   pw.println("PymentAmount: "+(HotelApna.totalPrice+x));
				   pw.println("-----------------------------------------------------------");
				   pw.flush();
				   System.out.println("Bill download done..");
			   }
			   else
			   {
				   System.out.println("Confirm the order 1st...!");
			   }
			   System.out.println("-----------------------------------------------------------\n");
		   }
		   public void conFirmation()
		   {
			   temp=1;
			   if(this.dCamp!=null || this.hApna!=null )
				   System.out.println("order is confirmed...!\nDownload the Bill Recipt..press 3");
			   else
				   System.out.println("1st select hotel...!");
		   }
	   
		

}
