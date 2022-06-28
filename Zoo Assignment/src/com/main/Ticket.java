package com.main;
import com.main.Main;
import java.util.Scanner;

public class Ticket {
public void weekday(int x) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of tickets");
	int n=sc.nextInt();
	System.out.println("total weekday ticket rate "+n*x+"rs");
	
}
public void weekend(int x) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of tickets");
	int n=sc.nextInt();
	System.out.println("total weekday ticket rate "+n*x);
	
}
public static void main(String[] args) {
	Main m=new Main();
	Ticket t=new Ticket();
	System.out.println("ticket page");
	System.out.println("zoo timings"+m.getTimings());
	System.out.println("zoo location"+m.getLocation());
	System.out.println("brief about zoo"+m.getZoo_brief());
	t.weekend(m.getTicketweekend());
	t.weekday(m.getTicketweekday());
	
	
}


}
