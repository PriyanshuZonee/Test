package org;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String first;
		String last;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Name :");
		first=scn.next();
		System.out.println("Enter Last Name :");
		last=scn.next();
		System.out.println("Hello "+first+" "+last);
	}

}
