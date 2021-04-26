package com.mani;

import java.util.Scanner;

public class ConfirmBooking {

	public static boolean getConfirmStatus() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter:\nPress OK to Book the Cab\nPress any key to cancel the booking");
		String ok = inp.next();
		boolean valid=false;
		if (ok.equalsIgnoreCase("ok"))
			valid=true;
		return valid;
}
	public static boolean reConfirmStatus() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter:\nPress 1 to go to Main Menu\nPress any key to close the Application");
		String ok = inp.next();
		boolean valid=false;
		if (ok.equalsIgnoreCase("1"))
			valid=true;
		return valid;
}
}

