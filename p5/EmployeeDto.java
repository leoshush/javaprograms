package com.mjava.p5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDto implements Comparable<EmployeeDto>{
    private int id;
    private String name;
    private double salary;
    public EmployeeDto() {
    	
    }

    // Constructor
    public EmployeeDto(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Display employee details
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
    @Override
    public int compareTo(EmployeeDto o) {
    	return this.getName().compareTo(o.getName());
    }

    public static void main(String[] args) {
      
        List<EmployeeDto> employees = new ArrayList<>();

        // Add employees
        employees.add(new EmployeeDto(105, "mayank", 70000));
        employees.add(new EmployeeDto(101, "Alice", 50000));
        employees.add(new EmployeeDto(102, "Bob", 60000));
        employees.add(new EmployeeDto(103, "Charlie", 55000));
        
        // Display all employees
        System.out.println("Employee List:");
        for (EmployeeDto emp : employees) {
            System.out.println(emp);
        }

        employees.stream().filter((ob)->(ob.getId()%2==0)).forEach(System.out :: print);
        
        employees.stream().map((ob)->(ob.getName())).forEach(System.out :: println); 
//        employees.stream().filter((ob1)->(ob1.getName().charAt(0)=='A')).map((ob)->(ob.getName())).forEach(System.out :: print);
        
        
        employees.stream().filter((ob1)->(ob1.getName().matches("^[A].*"))).map((ob)->(ob.getName())).forEach(System.out :: println);
//Count how many names start with R
       
        int c  = (int)employees.stream().filter((ob1)->(ob1.getName().matches("^[A].*"))).map((ob)->(ob.getName())).count();
       System.out.print(c);
       //create a seperate arraylist of employees whose name between a to m .
       
       List<EmployeeDto> obj2 =  employees.stream().filter((ob1)->(ob1.getName().matches("^[A-Ma-m].*"))).collect(Collectors.toList());
       
       System.out.println(obj2);
       // Write a sort for name 
//      Collections.sort(employees,(x,y)->(x.getName().compareTo(y.getName())));
      Collections.sort(employees);
      System.out.println(employees);
     
      
    }
    }

