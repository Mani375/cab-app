package com.chainsys;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class CabApp {

	public static void main(String[] args) {
		int a = 1;
		Scanner inp = new Scanner(System.in);
		System.out.println("********************Welcome to Ola Cabs***********************");
		while (a > 0) {
			System.out.println("***Login***");
			System.out.println("Enter Your Mobile Number:");
			long mobileNo = inp.nextLong();
			String mobileNoStr = String.valueOf(mobileNo);
			System.out.println("Enter Your Password:");
			String password = inp.next();
			int s = loginDetails(mobileNoStr, password);

			if (s == 1) {
				cabType();

				System.out.println("***Price Estimator***");
				System.out.println("Enter the Cab Type:");
				String cabType = inp.next();
				System.out.println("Enter the Distance;");
				int dist = inp.nextInt();
				float c = priceEstimator(cabType, dist);
				System.out.println("Enter:\nPress OK to Book the Cab\nPress any key to cancel the booking");
				String ok = inp.next();
				if (ok.equalsIgnoreCase("ok")) {
					System.out.println("***Booking Cab***");
					System.out.println("Enter your Journey Date After " + LocalDate.now() + ":"); // YYYY-MM-DD
					String jourDate = inp.next();
					LocalDate jouDaterstr = LocalDate.parse(jourDate);
					System.out.println("Enter the Cab Pickup time:");// HH:MM:SS
					String cabTime = inp.next();
					LocalTime cabTimestr = LocalTime.parse(cabTime);
					int hour = cabTimestr.getHour();
					System.out.println("Enter your Date of Birth:"); //YYYY-MM-DD
					String dob=inp.next();
					LocalDate dobstr = LocalDate.parse(dob);
					Period period=Period.between(dobstr,LocalDate.now());
					int age = period.getYears();
					bookingCab(c,hour,age);
					System.out.println("Press OK to confirm Booking\nPress any key to cancel the booking");
					String OK = inp.next();
					if (OK.equalsIgnoreCase("ok")) {
						System.out.println("\n\n*****Journey Details*****");
						System.out.println("Cab Type        : " + cabType);
						System.out.println("Journey Distance: " + dist);
						System.out.println("Journey Date    : " + jouDaterstr);
						System.out.println("Pickup Time     : " + cabTimestr);
						float d = priceEstimator(cabType, dist);
						bookingCab(d, hour,age);
						System.out.println("You have successfully booked the Cab...");
					} else {
						System.out.println("Your processes have been Cancelled....");
					}
				} else {
					System.out.println("Your processes have been Cancelled....");
				}
			}

			System.out.println("\n****Thank you for using our service****\n       *******Visit Again*******");
			System.out.println("\nPress 1 to move to the Main Menu\nPress 0 to close the Application");
			a = inp.nextInt();
		}
		inp.close();
	}
/**
 * This Method is used to check the Valid Credential
 * @param mobileNoStr
 * @param password
 * @return integer Value
 */
	public static int loginDetails(String mobileNoStr, String password) {
		if (mobileNoStr.length() == 10 && password.length() >= 8) {
			System.out.println("Successfully Logged in....");
			return 1;
		} else {
			System.out.println("Invalid Credential");
			return 0;
		}
	}
	
	/**
	 * This Method is used to display Cab Types
	 */
	public static void cabType() {
		System.out.println("\n***Cab Types***");
		System.out.println("1.Auto  (Rs.10/Km)\n2.Mini  (Rs.15/Km)\n3.Prime (Rs.20/Km)");
	}
	
	/**
	 * This Method is used for Price Estimation
	 * @param cabType
	 * @param dist
	 * @return Fare Amount
	 */
	public static float priceEstimator(String cabType, int dist) {
		int fare = 0;
		if (cabType.equalsIgnoreCase("Auto")) {
			fare = 10 * dist;
		}
		if (cabType.equalsIgnoreCase("Mini")) {
			fare = 15 * dist;
		}
		if (cabType.equalsIgnoreCase("Prime")) {
			fare = 20 * dist;
		}
		System.out.println("\n*****Price Estimated*****");
		System.out.println("SUBTOTAL    : Rs." + fare);
		double tax = fare * 0.07;
		float total = (float) (fare + tax);
		System.out.println("TAX   7.00% : Rs." + (float) tax);
		System.out.println("TOTAL AMOUNT: Rs." + total);
		System.out.println("\n****Peak Hours extra charges may applicable****");
		return total;
	}

	/**
	 * This Method is used to book the Cab
	 * @param c
	 * @param hour
	 * @param age
	 */
	public static void bookingCab(float c, int hour,int age) {
		if (hour >= 17 && hour <= 19) {
			System.out.println("Since this is a Peak Hour so extra charges may applicable");
			float t = (float) (0.125 * c);
			c = (float) (c + t);
			System.out.println("Peak Hours Charges: Rs." + t);
			if(age >= 60) {
				float t1= (float) (c * 0.5);
				c = (float) (c - t1);
			System.out.println("Senior Citizen    : Rs.-" + t1);
			}
			System.out.println("Total Fare        : Rs." + c);
		} else {
			if(age >= 60) {
				float t1= (float) (c * 0.5);
				c = (float) (c - t1);
			System.out.println("Senior Citizen    : Rs.-" + t1);
			}
			System.out.println("Total Fare        : Rs." + c);
		}

	}
}