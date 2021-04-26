package com.mani;

import java.util.Scanner;

public class GetDistance {

	public static int getDistance() {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Distance;");
		int dist = inp.nextInt();
		//inp.close();
		return dist;
	}

}
