package com.mjava.p5;

import java.util.function.Consumer;
import java.util.function.Predicate;

interface Test1<T1,T2> {
	public T1 f1(T2 x);
	
}
public class InterfaceGeneric {
      public static void main(String[] args) {
    	  Test1 <Integer,String> ob = (x)->(x.length());
//    	  Test1 <Integer,Boolean> ob2 = ()->();
          Predicate<Integer> ob1 = (x)->(x%2==0);
          Consumer<Integer> ob2 = (x)->System.out.println("This is the consumer value" + x);
          ob2.accept(30);
          if(ob1.test(3)) {
        	  System.out.println("Even");
          }
          else {
        	  System.out.println("Odd");
          }
      }
      
}

// design a rummy game keeping 3 players.
