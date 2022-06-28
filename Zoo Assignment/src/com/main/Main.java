package com.main;
import com.main.about.*;
import com.main.anad.*;
import com.main.travel.Jeep;
import com.main.about.Food;
public class Main {
public static String zoo_name;
private String location="AUSTRALIA";
private String timings="10AM-6PM";
private String zoo_brief="The best ZOO in AUSTRALIA";
private static int  zoo_workers;
private static int ticketweekend=500;
private static int ticketweekday=250;

Main(){
	System.out.println("zoo brief"+zoo_brief+"location"+location);
}
Main(int zoo_workers){
	this.zoo_workers=zoo_workers;
	System.out.println("number of workers in zoo"+zoo_workers);
}
public static void main(String[] args) {
	
	Animals ag=new Animals();
	System.out.println(ag.toString());
	System.out.println(ag.welcome("zeozo"));
	Main m=new Main();
	Main m1=new Main(500);
	Adoption ajj=new Adoption();
	System.out.println(ajj.welcome("zeozeo"));
Ticket t=new Ticket();
t.weekday(ticketweekday);
t.weekend(ticketweekday);
Food f=new Food();
f.Vegbuff();
f.nonvegbuff();
}
public static String getZoo_name() {
	return zoo_name;
}
public String getLocation() {
	return location;
}
public String getTimings() {
	return timings;
}
public String getZoo_brief() {
	return zoo_brief;
}
public static int getZoo_workers() {
	return zoo_workers;
}
public static int getTicketweekend() {
	return ticketweekend;
}
public static int getTicketweekday() {
	return ticketweekday;
}

}

