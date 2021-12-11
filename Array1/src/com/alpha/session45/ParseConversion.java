package com.alpha.session45;

public class ParseConversion {

	public static void main(String[] args) {
		String s="123";     
		boolean bol=Boolean.parseBoolean(s);
		int i=Integer.parseInt(s);
		float f=Float.parseFloat(s);
		System.out.println(bol);
		System.out.println(i);
		System.out.println(f);
	}

}
