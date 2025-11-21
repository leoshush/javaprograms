package com.mjava;

import java.util.Scanner;

public class Demo6 {
   
	 static String[] ones = {
		 "","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"	   			   
	   };
	 static String[] tens = {
			   "","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"
	   };
	   
   
	   public static String WordsbelowThousand(int num) {
		  String result="";
		   if(num>100)
		   {
			   result +=ones[num/100] + "Hundred";
			   num = num%100;
		   }
		   if(num>20)
		   {
			   result +=tens[num/10] + " ";
			   num = num%10;
		   }
		   if(num>0)
		   {
			   result += ones[num] + "";
		   }
		   return result.trim();
	   }
	   public static String convertToWords(int num) {
		  String result = "";
		  if(num==0)
		  {
			  return "Zero";
		  }
		  if(num>=10000000 )
		  {
			  result+=WordsbelowThousand(num/10000000)+ "Crore";
		      num= num%10000000;
		  }
		  if(num>=100000)
		  {
			  result+=WordsbelowThousand(num/100000)+ "Lakh";
		      num = num%100000;
		  }
		  if(num>=1000)
		  {
			  result+=WordsbelowThousand(num/1000) + "Thousand";
		      num = num%1000;
		  }
		  if(num>0)
		  {
			  result+=WordsbelowThousand(num)+"";
		  }
		  return result.trim();
	   }
	   public static void main(String[] args) {   
	      Scanner sc  = new Scanner(System.in);
	      String result ;
	       int number = sc.nextInt();
	      result = convertToWords(number);
	      System.out.println("result is "+ result);
	   }
	   
   
}
