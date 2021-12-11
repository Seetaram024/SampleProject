package collection1;
	import java.util.Scanner;

	public class DosaCamp {
		 private String hotelName="!!..DosaCamp..!!";
	     static int totalPrice;
	     final int dosa=40;
	     final int idaly=20;
	     final int meal=60;
	     final int puri=40;
	     
	     
	      int totalDosa;
	      int totalIdaly;
	      int totalMeal;
	      int totalPuri;
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
		    	System.out.println("1)Dosa\t-40\n2)Idaly\t-20\n3)Meal\t-60\n4)Puri\t-40\n5)Exit");
		    else
		    	System.out.println("if you want select again food plze enter the ..Optin:");
			int dcOption=sc1.nextInt();
			if(dcOption==1)
			{
				System.out.println("enter dosa quantity..");
				int quant=sc1.nextInt();
				System.out.println(quant+" :Dosa added.. ");
				totalDosa+=quant;
				dosa(quant);
			}
			else if(dcOption==2)
			{
				System.out.println("enter Idaly quantity..");
				int quant=sc1.nextInt();
				System.out.println(quant+" :Idaly added.. ");
				totalIdaly+=quant;
				idaly(quant);
			}
			else if(dcOption==3)
			{
				System.out.println("enter Meal quantity..");
				int quant=sc1.nextInt();
				System.out.println(quant+" :Meal added.. ");
				totalMeal+=quant;
				meal(quant);
			}
			else if(dcOption==4)
			{
				System.out.println("enter Puri quantity..");
				int quant=sc1.nextInt();
				System.out.println(quant+" :Puri added.. ");
				totalPuri+=quant;
				puri(quant);
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
		public void dosa(int quant)
		{
			int totalDosaPrice=0;
			for(int i=1; i<=quant; i++)
			{
				totalDosaPrice+=dosa;
			}
			totalPrice+=totalDosaPrice;
		}
		public void idaly(int quant)
		{
			int totalIdalyPrice=0;
			for(int i=1; i<=quant; i++)
			{
				totalIdalyPrice+=idaly;
			}
			totalPrice+=totalIdalyPrice;
		}
		public void meal(int quant)
		{
			int totalMealPrice=0;
			for(int i=1; i<=quant; i++)
			{
				totalMealPrice+=meal;
			}
			totalPrice+=totalMealPrice;
		}
		public void puri(int quant)
		{
			int totalPuriPrice=0;
			for(int i=1; i<=quant; i++)
			{
				totalPuriPrice+=puri;
			}
			totalPrice+=totalPuriPrice;
		}
		
	}

