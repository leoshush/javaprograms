package com.mjava.p5;

public class LambdaExp {
    public static void main(String[] args) {
      	IsMath obj = (x,y) ->(x+y);
      	IsMath obj1 = (x,y) -> {
      	  int z = x-y;
      	   return z;
      	};
     
      	System.out.println(obj.cal(10, 20));
      	System.out.println(obj1.cal(30,20));
       f1((x,y)->(x/y),10,2);
       f1((x,y)->(x*y),10,2);
    }
    public static void f1(IsMath obj,int a,int b)
    {
    	System.out.println(obj.cal(a, b));
    }
}
// interface that has only one abstract method
@FunctionalInterface 
interface IsMath{
	public int cal(int a,int b);
}

// create a function which receives lambda expression and perform Aritmethic operation.  
//write a code to check a number is even or odd using predicate interface.