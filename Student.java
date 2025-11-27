package com.mjava.sorts;

import java.util.Date;

public class Student {
  int  sid;
  String name;
  Date dob;
  Student next = null;
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + "]";
}
}
