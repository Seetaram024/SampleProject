package lapi;

public class Laptop {
	private String brand;
	private int ram;
	private int price;
	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString()
	{
		return "[brand:"+brand+" ram :"+ram+"price : "+price+"]";	
	}
	public boolean equals(Object o)
	{
		Laptop lp=(Laptop)o;
		if(this.brand.equals(lp.brand) && this.ram==lp.ram && this.price==lp.price)
			return true;
		else 
			return false;
	} 
	public int hashCode()
	{
		return ram+price;
	}

	/*public int compareTo( Object o) {
		Laptop l1=(Laptop)o;
		if(this.ram>l1.ram)
			return 1;
		else if(this.getRam()<l1.getRam())
			return -1;
		else
			return 0;
	} */
}
