package Service;

import java.text.ParseException;
import java.util.Scanner;

import Model.HotelReservation;

public class Application {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		HotelReservation hotelManagementSystem = new HotelReservation();
		System.out.println("Welcome to Hotel Reservation System");

		while (true) {
			System.out.println("Choose Options " + "\n1. Add Hotel" + "10: Exit ");
			String userOption = scanner.next();
			switch (userOption) {
			case "1":
				HotelReservation.addHotel();
				break;
			case "10":
				System.exit(0);
			}
		}
	}

}
