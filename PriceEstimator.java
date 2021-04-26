package com.mani;

public class PriceEstimator {

	public static int calculateBaseFare(String cabType,int dist) {
		
		int fare = 0;
		if (cabType.equalsIgnoreCase("Auto")) 
			fare = 10 * dist;
		if (cabType.equalsIgnoreCase("Mini")) 
			fare = 15 * dist;
		if (cabType.equalsIgnoreCase("Prime")) 
			fare = 20 * dist;
		return fare;
}
	public static float displayBasePrice(int fare,float tax) {
		System.out.println("***Price Estimated***");
		System.out.println("SUBTOTAL    : Rs." + fare);
		float total = (float) (fare + tax);
		System.out.println("TAX   7.00% : Rs." + (float) tax);
		System.out.println("TOTAL AMOUNT: Rs." + total);
		System.out.println("\n****Peak Hours extra charges may applicable****");
		return total;
	}
}
