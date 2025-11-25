package com.mjava.p6;

import java.util.ArrayList;
import java.util.List;

import com.mjava.p5.EmployeeDto;
public class Demo3 {
    public static void main(String[] args) {
    	List<EmployeeDto> ob = new ArrayList();
    	ob.add(new EmployeeDto(1011,"Aman",40000));
    	ob.add(new EmployeeDto(1012,"Avinash",50000));
    	Display ob1 = new Display();
    	ob1.f1(ob);
    }
}
class Display{
	public void f1(List<? extends Object> ob) {
		ob.forEach(System.out :: println);
	}
}
// create a class which extends student dto and try with same class.
