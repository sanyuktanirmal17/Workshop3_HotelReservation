package Service;

import java.text.ParseException;
import java.util.Scanner;

import Model.Hotel;
import Model.HotelManagementService;

public class Application {
    Scanner scanner = new Scanner(System.in);
    HotelManagementService hotelManagementSystem = new HotelManagementService();

    public static void main (String[] args) throws ParseException {

        System.out.println("Welcome to Hotel Reservation System");

        Application application = new Application();
        application.provideUserOption();
    }

    public void provideUserOption() throws ParseException {
        while(true) {
        System.out.println("Choose Options " +
                "\n1. Add Hotel" +
                "\n2. Find Cheapest Hotel " );
        String userOption = scanner.next();
            switch (userOption) {
                case "1" :
                    addHotel();
                    break;
                case "2":
                    findCheapestHotel();
                case "10" :
                    System.exit(0);
            }
        }
    }



	public void addHotel() {
        Hotel hotel = new Hotel();
        System.out.println("Enter Hotel Name");
        String name = scanner.next();
        System.out.println("Enter weekday rate ");
        float rate = scanner.nextFloat();
        hotel.setHotelName(name);
        hotel.setRates(rate);
        hotelManagementSystem.hotelList.add(hotel);
        System.out.println(hotelManagementSystem.hotelList);
    }

    public void findCheapestHotel() throws ParseException {
        System.out.println("Enter check-In Date : (dd/mm/yyyy)");
        String checkInDate = scanner.next();
        System.out.println("Enter check-Out Date : (dd/mm/yyyy)");
        String checkOutDate = scanner.next();
        int days = hotelManagementSystem.findDateDifference(checkInDate, checkOutDate);
        System.out.println("Number of days stying in hotel " +days);
        Hotel cheapestHotel = hotelManagementSystem.findCheapestHotel(days);
        float totalRate = cheapestHotel.getRates() * days;
        System.out.println("Cheapest hotel is " + cheapestHotel.getHotelName() + " having rate $ " + totalRate);
    }
}
