package com.mani;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class GetJourneyDetails {

	public static LocalDate getJourneyDate() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter your Journey Date After " + LocalDate.now() + ":"); // YYYY-MM-DD
		String journeyDate = inp.next();
		LocalDate journeyDateStr = LocalDate.parse(journeyDate);
		return journeyDateStr;
	}
	
	public static LocalTime getPickuptime() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Cab Pickup time:");// HH:MM:SS
		String cabTime = inp.next();
		LocalTime cabTimeStr = LocalTime.parse(cabTime);
		return cabTimeStr;
	}
	
	public static LocalDate getDateOfBirth() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter your Date of Birth:"); // YYYY-MM-DD
		String dob = inp.next();
		LocalDate dobStr = LocalDate.parse(dob);
		return dobStr;
	}

}
