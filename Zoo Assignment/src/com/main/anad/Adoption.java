package com.main.anad;
import com.main.about.Zoo_welcome;
import com.main.travel.Jeep;

public class Adoption extends Jeep implements Zoo_welcome{
	public String welcome(String zooname) {
		return "welcome to "+zooname+" please adopt the animals save the world";
	}

	public static void main(String[] args) {
		Jeep j=new Jeep ();
		System.out.println(j.toString());
	
}
	}