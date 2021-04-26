package com.mani;

import java.util.Scanner;

public class GetPassword {
	public static String password() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Your Password:");
		String passWord = inp.next();
		//inp.close();
		return passWord;
	}

}
