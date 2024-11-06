package com.bbs.numberpgm;

import java.util.Scanner;

public class ConcedeTwoString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the Fname");
		String Fname = scn.next();

		System.out.println("enter the Lname");
		String Lname = scn.next();

		String fullname = Fname + Lname;
		System.out.println("NAME : " + fullname);
		scn.close();
	}

}
