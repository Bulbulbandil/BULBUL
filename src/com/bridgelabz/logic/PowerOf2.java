package com.bridgelabz.logic;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Enter exponent vaule and base vaule");
		int exponent=Util.intScanner();
		int base=Util.intScanner();
		//int base=2;
		Utility.powerOf2(exponent, base);
		
		

	}

}
