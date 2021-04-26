package com.mani;

public class SeniorCitizen {

	public static float checkSeniorCitizen(int age,float peakHourTotal) {
		if (age >= 60) {
			float seniorDiscountPrice = (float) (peakHourTotal * 0.3);
			System.out.println("Senior Citizen    : Rs.- " + seniorDiscountPrice);
			return seniorDiscountPrice;
	}
		else {
			float seniorDiscountPrice=(float) 0.0;
			System.out.println("Senior Citizen    : Rs.- " + seniorDiscountPrice);
			return seniorDiscountPrice;
		}
}
}
