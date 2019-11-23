package com.bridgelabz.function;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		System.out.println("Enter two points values like (x1,y1) and (x2,y2) ");
        int x1=Util.intScanner();
        int y1=Util.intScanner();
        int x2=Util.intScanner();
        int y2=Util.intScanner();
        Utility.distance(x1, y1, x2, y2);

	}

}
