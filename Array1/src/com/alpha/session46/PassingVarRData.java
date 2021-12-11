package com.alpha.session46;

public class PassingVarRData {

	private static void add(int... a) {
		int add=0,count=0,square=0;
	/*	while(a>0) {
			square=square + a%10;
			count++;
			a/=10;
		} */
		while(a>0 ){
			add+=a;
		}
	}

	public static void main(String[] args) {
		
		add(10,20,30);
	}

}
