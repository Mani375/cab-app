package com.mani;

import java.util.Scanner;

public class GetCabType {

	public static String enterCabType() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Cab Type:");
		String cabType = inp.next();
		//inp.close();
		return cabType;
	}

}
