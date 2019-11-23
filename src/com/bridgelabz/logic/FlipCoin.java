package com.bridgelabz.logic;

import com.bridgelabz.util.Util;
import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter no of toss of coin ");
		int toss= Util.intScanner();
		Utility.flipCoin(toss);

	}

}
