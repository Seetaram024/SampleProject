package thread3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table1 t1=new Table1(10,"E:/10 g/abc1.txt");
		Table1 t2=new Table1(10,"E:/10 g/abc2.txt");
		Table1 t3=new Table1(10,"E:/10 g/abc3.txt");
		Table1 t4=new Table1(10,"E:/10 g/abc4.txt");
		t1.start();
		t2.start();

		t3.start();

		t4.start();

	}

}
