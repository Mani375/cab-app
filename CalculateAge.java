package com.mani;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static int calculateAge(LocalDate dobstr) {
		Period period = Period.between(dobstr, LocalDate.now());
		int age = period.getYears();
		return age;
	}

}
