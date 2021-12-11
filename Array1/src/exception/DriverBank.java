package exception;

public class DriverBank {
 
  
	public static void main(String[] args) {
		Bank b=new Bank(); 
		try
		{
			if(b.bal>100)
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("handled");
		}
		 

	}

}
