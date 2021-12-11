package thread8;

public class P {

	public static void main(String[] args) {
		int num1=1;
		char c='A';
/*	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	} */
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j%2==0) {
					System.out.print(num1);
					num1++;
				}else {
					System.out.print(c);
					c++;
				}
			}
			System.out.println();

		}

	}

}
