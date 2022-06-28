package com.main.travel;

public class Jeep{
	//@Override
	public String toString() {
		return "to book Jeep contact number=" + contact_no ;
	}
	
	static long contact_no=1234567890;
public static void main(String[] args) {
	Jeep j=new Jeep();
	System.out.println(j);
}
}