package com.bridgelabz.function;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Enter value of value of a,b,c in quadratic equation  ");
		double a=Util.doubleScanner();
		double b=Util.doubleScanner();
		double c=Util.doubleScanner();
		Utility.quadratic(a,b,c);


	}

}
