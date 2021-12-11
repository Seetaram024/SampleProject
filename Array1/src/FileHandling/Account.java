package FileHandling;

public class Account {
long aN;
int pwd;
double bal;
Account(long aN,int pwd,double bal)
{
	this.aN=aN;
	this.pwd=pwd;
	this.bal=bal;
}

public double withdraw(int pwd,double amount)
{
	if(amount<this.bal)
	{
		return 1.0;
	}
	else if(this.pwd!=pwd)
	{
		return -1.0;
	}
	else 
	{
		return 0.0;
	}
	
}
}
