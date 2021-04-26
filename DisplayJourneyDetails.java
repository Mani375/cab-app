package com.mani;

import java.time.LocalDate;

public class DisplayJourneyDetails {

	public static void journeyDetails(String cabType, int dist, LocalDate journeyDateStr, String cabTimeStr) {

		System.out.println("\n\n      *****Journey Details*****");
		System.out.println("Cab Type               : " + cabType);
		System.out.println("Journey Distance       : " + dist);
		System.out.println("Journey Date           : " + journeyDateStr);
		System.out.println("Pickup Time            : " + cabTimeStr);
	}
	public static void priceDetails(int fare, float tax, float total,float peakHourCharge,float seniorDiscountPrice,float seniorTotal) {
		System.out.println("       ***Price Details***");
		System.out.println("SUBTOTAL               : Rs." + fare);
		System.out.println("TAX  7.00%             : Rs." + tax);
		System.out.println("TOTAL AMOUNT           : Rs." + total);
		System.out.println("***Peak Hour extra charges may applicable***");
		System.out.println("Peak Hour Charges      : Rs." + peakHourCharge);
		System.out.println("Senior Citizen Discount: Rs." + seniorDiscountPrice);
		System.out.println("TOTAL FARE             : Rs." + seniorTotal);
		System.out.println("You have successfully booked the Cab....");
		System.out.println("\n****Thank you for using our service****\n       *******Visit Again*******");
}
}

