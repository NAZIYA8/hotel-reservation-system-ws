/**
 * ****************************************************************************
 * Purpose: This class is Hotel Reservation class which contains different methods
 * that can be called.it also contains the main method.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 26-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.HotelReservationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {

	static Scanner scanner = new Scanner(System.in);
	private static List<Hotel> hotelList = new ArrayList<>();

	/**
	 * This method is used to add Hotel to Hotel Reservation System that adds name
	 * and rate for Regular Customer.
	 */
	public static void addHotel() {
		while (true) {
			System.out.println("Add a hotel:");
			System.out.println("Enter Hotel Name:");
			String hotelName = scanner.next();
			System.out.println("Enter rate for regular customer");
			int regularCustomerRate = scanner.nextInt();
			Hotel hotel = new Hotel(hotelName, regularCustomerRate);
			hotelList.add(hotel);
			System.out.println("Do You Want to add More hotel(Y/N)");
			char choice = scanner.next().charAt(0);
			if (choice != 'Y')
				break;
		}
	}

	/**
	 * This is the main method of the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
		addHotel();
	}
}
