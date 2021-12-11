package generic;

public class Account {
	String Acchol_name;
	long Accnum;
	String password;
	double balance;
	public Account(String Acchol_name, long Accnum, String password, double balance) {
		
		this.Acchol_name = Acchol_name;
		this.Accnum = Accnum;
		this.password = password;
		this.balance = balance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "acc name : "+Acchol_name+"\nAcc num : "+Accnum+"Acc balance : "+balance;
	}
	public String getAcchol_name() {
		return Acchol_name;
	}
	public void setAcchol_name(String acchol_name) {
		Acchol_name = acchol_name;
	}
	public long getAccnum() {
		return Accnum;
	}
	public void setAccnum(long accnum) {
		Accnum = accnum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
