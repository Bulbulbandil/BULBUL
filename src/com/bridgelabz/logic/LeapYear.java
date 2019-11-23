package com.bridgelabz.logic;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter Any Year....For is it Leap Year ya Not");
		int year=Util.intScanner();
		boolean value=Utility.leapYear(year);
		System.out.println(value);

	}

}
