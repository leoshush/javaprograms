package com.mavenproject.p1;

import java.sql.Connection;
import java.util.List;

import com.mjava.Reed;

public class Democonnector {

	public static void main(String[] args) {
		try {
			StudentDAO student = new StudentDAO();
		    int ch =0 ;
		    do {
				System.out.println("Enter 0 for exit & 1 for display & 2 for display idwise ");
				ch = Reed.sc.nextInt();
				switch (ch) {
				case 0:
					 System.out.println("Thank you for using the program");
					 student = null;
				     break;
				case 1:
					List<StudentDto> l1 = student.getAllStudents();
					l1.forEach(System.out :: println);
				case 2:
					StudentDto l2 = new StudentDto();
					System.out.println("Enter the roll no");
					l2.setSroll(Reed.sc.nextInt());
					System.out.println(student.getById(l2));
				case 3:
					StudentDto l4 = new StudentDto();
					l4.setSroll(Reed.sc.nextInt());
					l4.setFirstname(Reed.sc.next());
					l4.setLname(Reed.sc.next());
					l4.setDob(Reed.sc.next());
					l4.setGender(Reed.sc.next());
					int rowsinserted = student.insertStudent(l4);
				    if(rowsinserted>0) {
				    	System.out.println("inserted");
				    }
				    else {
				    	System.out.println("not inserted");
				    }
				    break;
				case 4:
					StudentDto l3 = new StudentDto();
					System.out.print("Enter the roll number to be deleted");
					l3.setSroll(Reed.sc.nextInt());
					if(student.deleteStudentById(l3))
					{
						System.out.println("deleted ");
					}
					else
					{
						System.out.println("not deleted");
					}
				default:
					 System.out.println("Please enter the correct input");
					 break;
				}
			} while (ch!=0);
		
		}
		catch(Exception e) {
		
			System.out.print(e.getMessage());
		}

	}

}
