import java.time.LocalDate;
import java.time.LocalTime;

import com.mani.CalculateAge;
import com.mani.CheckLoginDetails;
import com.mani.ConfirmBooking;
import com.mani.ConvertHour;
import com.mani.DisplayCabType;
import com.mani.DisplayJourneyDetails;
import com.mani.GetMobileNo;
import com.mani.GetPassword;
import com.mani.GstTaxes;
import com.mani.PeakHour;
import com.mani.PriceEstimator;
import com.mani.SeniorCitizen;
import com.mani.GetCabType;
import com.mani.GetDistance;
import com.mani.GetJourneyDetails;

public class CabApp {
	public static void main(String[] args) {
		System.out.println("********************Welcome to Cabs App***********************");
		boolean reBookingConfirm = true;
		while (reBookingConfirm) {
			System.out.println("\n ***Login***");
			String mobileNo = GetMobileNo.mobileNo();
			String passWord = GetPassword.password();
			boolean validlogin = CheckLoginDetails.checkLogin(mobileNo, passWord);
			if (validlogin) {
				DisplayCabType.displayCabs();
				System.out.println("\n***Price Estimator***");
				String cabType = GetCabType.enterCabType();
				int dist = GetDistance.getDistance();
				int fare = PriceEstimator.calculateBaseFare(cabType, dist);
				float tax = GstTaxes.gstTax(fare);
				float total = PriceEstimator.displayBasePrice(fare, tax);
				boolean valid = ConfirmBooking.getConfirmStatus();
				if (valid) {
					System.out.println("***Booking Cab***");
					LocalDate journeyDateStr = GetJourneyDetails.getJourneyDate();
					LocalTime cabTimeStr = GetJourneyDetails.getPickuptime();
					int hour = ConvertHour.convertHour(cabTimeStr);
					LocalDate dobStr = GetJourneyDetails.getDateOfBirth();
					int age = CalculateAge.calculateAge(dobStr);
					float peakHourCharge = PeakHour.checkPeakHour(hour, total);
					float peakHourTotal = (float) (peakHourCharge + total);
					float seniorDiscountPrice = SeniorCitizen.checkSeniorCitizen(age, peakHourTotal);
					float seniorTotal = (float) (peakHourTotal - seniorDiscountPrice);
					System.out.println("Total Fare        : Rs." + seniorTotal);
					boolean bookingConfirm = ConfirmBooking.getConfirmStatus();
					if (bookingConfirm) {
						DisplayJourneyDetails.journeyDetails(cabType, dist, journeyDateStr, cabType);
						DisplayJourneyDetails.priceDetails(fare, tax, total, peakHourCharge, seniorDiscountPrice,
								seniorTotal);
					} else {
						System.out.println("Your processes have been Cancelled....");
					}
				} else {
					System.out.println("Your processes have been Cancelled....");
				}
			}
			reBookingConfirm = ConfirmBooking.reConfirmStatus();
		}
	}
}
