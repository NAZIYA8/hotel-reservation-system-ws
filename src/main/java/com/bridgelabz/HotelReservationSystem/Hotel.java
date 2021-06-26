/**
 * ****************************************************************************
 * Purpose: This is a Hotel Class.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 26-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.HotelReservationSystem;

public class Hotel {

	private String hotelName;
	private int regularCustomerRate;

	public Hotel(String hotelName, int regularCustomerRate) {
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRegularCustomerRate() {
		return regularCustomerRate;
	}

	public void setRegularCustomerRate(int regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}
}
