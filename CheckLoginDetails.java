package com.mani;

public class CheckLoginDetails {

	public static boolean checkLogin(String mobileNo, String passWord) {
		boolean valid = false;
		if (mobileNo.length() == 10 && passWord.length() >= 8)
			valid = true;
		if(valid) {
			System.out.println("\nSuccessfully Logged in....");
			return valid;
		}
		else {
			System.out.println("\nInvalid Credential");
			return valid;
			
	}
}
}

