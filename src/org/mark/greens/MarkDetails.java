package org.mark.greens;

import java.util.Scanner;

public class MarkDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	System.out.println("Please enter the student Id");
	String next = s.next();	
	System.out.println("The student Id is "+next);
	
	System.out.println("Please enter the student name");
	s.nextLine();
	String nextLine = s.nextLine();
	System.out.println("The student Name is "+nextLine);
	
	 int a,b;
	 
	System.out.println("Please enter mark1");
	int mark1= s.nextInt();
	
	System.out.println("Please enter mark2");
	int mark2= s.nextInt();
	
	System.out.println("Please enter mark3");
	int mark3= s.nextInt();
	
	System.out.println("Please enter mark4");
	int mark4= s.nextInt();
	
	System.out.println("Please enter mark5");
	int mark5 = s.nextInt();
	
	a = mark1+mark2+mark3+mark4+mark5;
	System.out.println("The total value is "+a);
	
	b = a/5;
	System.out.println("The average of the mark is "+b);
	
	System.out.println("oneeeeee");
	System.out.println("twooooooo");
	}

}
