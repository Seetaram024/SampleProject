package collection1;


	import java.util.Scanner;

	public class HotelApna {
		  private String hotelName="!!..HotelApna..!!";
		  static int totalPrice;
		     final int biryani=150;
		     final int chiken=120;
		     final int muton=160;
		     final int chikenCurry=180;
		     
		      int totalBiryani;
		      int totalChiken;
		      int totalMuton;
		      int totalChikenCurry;
		     public String getHotelName()
		     {
		    	 return hotelName;
		     }
		   
			public void menuCar()
			{
				Scanner sc1=new Scanner(System.in);
				System.out.println("plz select and add the menu...!");
				boolean flag=true;
				int mTemp=0;
				while(flag)
				{
				if(mTemp==0)
					System.out.println("1)Biryani\t-150\n2)Chiken\t-120\n3)Muton\t\t-160\n4)ChikenCurry\t-180\n5)Exit");
				else
					System.out.println("if you want select again food plze enter the ..Optin:");
				int dcOption=sc1.nextInt();
				if(dcOption==1)
				{
					System.out.println("enter biryani quantity..");
					int quant=sc1.nextInt();
					System.out.println(quant+" :biryani added.. ");
					totalBiryani+=quant;
					biryani(quant);
				}
				else if(dcOption==2)
				{
					System.out.println("enter chiken quantity..");
					int quant=sc1.nextInt();
					System.out.println(quant+" :chiken added.. ");
					totalChiken+=quant;
					chiken(quant);
				}
				else if(dcOption==3)
				{
					System.out.println("enter muton quantity..");
					int quant=sc1.nextInt();
					System.out.println(quant+" :muton added.. ");
					totalMuton+=quant;
					muton(quant);
				}
				else if(dcOption==4)
				{
					System.out.println("enter chikenCurry quantity..");
					int quant=sc1.nextInt();
					System.out.println(quant+" :chikenCurry added.. ");
					totalChikenCurry+=quant;
					chikenCurry(quant);
				}
				else if(dcOption==5)
				{
					System.out.println("plz confirm the order...");
					flag=false;
				}
				else
				{
					System.out.println("plz select right menu option...!");
				}
				mTemp=1;
			}
			}
			public void biryani(int quant)
			{
				int totalbiryaniPrice=0;
				for(int i=1; i<=quant; i++)
				{
					totalbiryaniPrice+=biryani;
				}
				totalPrice+=totalbiryaniPrice;
			}
			public void chiken(int quant)
			{
				int totalchikenPrice=0;
				for(int i=1; i<=quant; i++)
				{
					totalchikenPrice+=chiken;
				}
				totalPrice+=totalchikenPrice;
			}
			public void muton(int quant)
			{
				int totalmutonPrice=0;
				for(int i=1; i<=quant; i++)
				{
					totalmutonPrice+=muton;
				}
				totalPrice+=totalmutonPrice;
			}
			public void chikenCurry(int quant)
			{
				int totalchikenCurryPrice=0;
				for(int i=1; i<=quant; i++)
				{
					totalchikenCurryPrice+=chikenCurry;
				}
				totalPrice+=totalchikenCurryPrice;
			}
	}

