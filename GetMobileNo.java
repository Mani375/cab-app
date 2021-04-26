package com.mani;

import java.util.Scanner;

public class GetMobileNo {
	public static String mobileNo() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Your Mobile Number:");
		long mobileNo = inp.nextLong();
		String mobileNoStr = String.valueOf(mobileNo);
		//inp.close();
		return mobileNoStr;
		}
}
