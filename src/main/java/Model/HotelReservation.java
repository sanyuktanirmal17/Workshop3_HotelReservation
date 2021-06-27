package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
	
		static ArrayList<Hotel> hotelList = new ArrayList<>();
		static Scanner scanner = new Scanner(System.in);
		
		public static void addHotel() {
	        Hotel hotel = new Hotel(null, 0);
	        System.out.println("Enter Hotel Name");
	        String name = scanner.next();
	        System.out.println("Enter rate ");
	        float rate = scanner.nextFloat();
	        hotel.setHotelName(name);
	        hotel.setRates(rate);
	        HotelReservation.hotelList.add(hotel);
	        System.out.println(hotelList);
	    }
	}




