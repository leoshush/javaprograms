package com.mjava.sorts;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.mjava.Reed;
import com.mjava.patterns.TemplateDesign;

public class Demo2 extends TemplateDesign{
	static Student head = null;
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	static Student tail = null;

  public static void main(String[] args) throws ParseException {
	
	  int ch=0;
	  do {
		System.out.println("Enter 0 to exit , 1 to add , 2 to display");
		ch = Reed.sc.nextInt();
		switch(ch) {
		case 0:
			 break;
		case 1:
			Student x = new Student();
			System.out.println("Enter id, name & dob");
			x.sid = Reed.sc.nextInt();
			x.name = Reed.sc.next();
			x.dob = sdf.parse(Reed.sc.next());
			if(head == null) {
				head = tail =x ;
			}
			else {
				tail.next = x;
				tail = x;
			}
			break;
		case 2:
			Demo2 ob = new Demo2();
			ob.header();
			ob.printdata();
			ob.footer();
			break;
		default:
			System.out.println("Invalid Entry , please try again");
	        break;
	  }} while (ch!=0);
  
	  
  
}
    private static void display(Student head) {
    	if(head == null) return ;
    	String data = """
    			    %-10d %-30s %s
     			      """;
    	System.out.println(data.formatted(head.sid,head.name,sdf.format(head.dob)));
    	display(head.next);
    	
    }
    
    // text block 
    @Override
	public void header() {
		String h1 = """
				New Mini Project   
				%s
				%-10s %-30s %s
				%s
				
				""";
		System.out.println(h1.format("=".repeat(60), "sid","name","dob","=".repeat(60)));
		
	}
	@Override
	public void printdata() {
		
		display(head);
	}
	@Override
	public void footer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void consolidation() {
		// TODO Auto-generated method stub
		
	}
    
}

