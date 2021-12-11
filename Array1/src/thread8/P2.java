package thread8;

public class P2 {
public static void main(String[] args) {
	int sum=0,sum1=0;
	/* for(int i=1;i<=5;i++)
	{
		if(i%2==0)
		{
			sum+=i;
			}
	}
	System.out.println("sum of even" +sum);

	for(int j=1;j<=5;j++)
	{
		if(j%2!=0) 
		{
			sum1+=j;
			//System.out.println(sum);

		}
	}
	System.out.println("sum of odd "+sum1);  */
	
	//approach-2 
	for(int i=1;i<=5;i++)
	{
		if(i%2==0)
			sum=sum+i;
		else
			sum1+=i;
	}
	System.out.println(sum);
	System.out.println(sum1);
	}

}

