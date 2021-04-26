package com.mani;

public class GstTaxes {

	public static float gstTax(int fare) {
		float tax = (float) (fare * 0.07);
		return tax;
	}
}
