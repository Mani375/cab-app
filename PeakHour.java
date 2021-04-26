package com.mani;

public class PeakHour {

	public static float checkPeakHour(int hour, float total) {
		if (hour >= 17 && hour <= 19) {
			System.out.println("Since this is a Peak Hour so extra charges may applicable");
			float peakHourCharge = (float) (0.125 * total);
			System.out.println("Peak Hours Charges: Rs." + peakHourCharge);
			return peakHourCharge;
		} else {
			float peakHourCharge = (float) 0.0;
			System.out.println("Peak Hours Charges: Rs." + peakHourCharge);
			return peakHourCharge;
		}
	}
}
