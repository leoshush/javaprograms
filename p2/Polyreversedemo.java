package com.mjava.p2;

public class Polyreversedemo {
     public int reverse(int a)
     {
          return Integer.parseInt(reverse(String.valueOf(a)));	 
     }
     public String reverse(String a)
     {
    	 return new StringBuilder(a).reverse().toString();
     }
     public float reverse(float a)
     {
    	 return Float.parseFloat(new StringBuilder(Float.toString(a)).reverse().toString());
     }
     public long reverse(long a)
     {
    	 return Long.parseLong(new StringBuilder(Long.toString(a)).reverse().toString());
     }
}
