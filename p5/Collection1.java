package com.mjava.p5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection1 {
   public static void main(String[] args)
   {
	   ArrayList<String> empName = new ArrayList();
   	empName.add("Aman");
   	empName.add("naman");
   	empName.add("ishan");
   	
   	Collections.sort(empName);
   	
   	for(int i=0;i<empName.size();i++) {
   		System.out.println(empName.get(i));
   	}
   	for(String x:empName)
   	{
   		System.out.println(x + "");
   	}
   	Iterator<String>it = empName.iterator();
   	while(it.hasNext())
   	{
   		System.out.println(it.next());
   	}
   	empName.remove("Aman"); 
   	empName.forEach((x)->System.out.println(x+""));
   	
   	empName.forEach(System.out :: print); // using for each consumer and method reference
   	
   	empName.forEach(Collection1 :: psv);
//   	System.out.println("... usingfor each consumer and user static method");
   
   	 Collection1 obj = new Collection1();
   	 empName.forEach(obj :: psv1);
   	 
//   	 System.out.println("... using for each consumer and user instance method reference");
   
     List<String> l2 = new ArrayList<>(Arrays.asList(new String[] {"NEHA","SAMAY"}));
     empName.addAll(l2);
     
     System.out.println(empName);
     
   
   }
   

   public static void psv(String x) {
   	System.out.println(x+"--->+...."); 
   }
   
   public  void psv1(String x) {
	   	System.out.println(x+"--->+...."); 
	   }
	  
  

}

