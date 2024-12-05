package com.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Employee{
	int eno;
	String ename;
	Date doj;
	char gender;
	boolean isIndian;
	float salray;
	void add() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno:");
		eno = sc.nextInt();
		System.out.println("Enter ename:");
		ename= sc.next();
		System.out.print("Enter a date (dd/mm/yyyy): ");  
		String dateStr = sc.next(); 
		
		/* Handling Date*/
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		sdf.setLenient(false);
		try {
			doj = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		/* ends here */
		
		System.out.println("Enter gender:");
		gender = sc.next().charAt(0);  
		System.out.println("is indian true/false:");
		isIndian = sc.nextBoolean();
		System.out.println("Enter salary:");
		salray = sc.nextFloat();
		
		
	}
	void disaply() {
		
		System.out.println(eno);
		System.out.println(ename);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(doj);
		System.out.println(date);
		System.out.println(gender);
		System.out.println(isIndian);
		System.out.println(salray);
	}
	
	
	
}
public class DataSetExample {


	public static void main(String[] args) {
		
	
		Employee e1=new Employee();
		e1.add();
		e1.disaply();
	}
	

}
