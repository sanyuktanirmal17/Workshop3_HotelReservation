package Model;

import java.util.ArrayList;
import java.util.Scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class HotelManagementService {
    Scanner scanner = new Scanner(System.in);
    public List<Hotel> hotelList = new ArrayList<>();
    /**
     * 
     * @param startDate stay date 
     * @param endDate
     * @return show date 
     * @throws ParseException
     */

    public int findDateDifference(String startDate, String endDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse(startDate);
        Date secondDate = sdf.parse(endDate);
        long differenceInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        int days = (int) TimeUnit.DAYS.convert(differenceInMillies, TimeUnit.MILLISECONDS);
        return days;
    }
    /**
     * compare cheapest hotel
     */

    Comparator<Hotel> minComparator = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return h1.compareTo(h2);

        }
    };

    /**
     * 
     * @param numDays
     * @return 
     * show cheap hotel date 
     */

    public Hotel findCheapestHotel(int numDays) {
        int lowestRate;
        Optional<Hotel> hotel = hotelList.stream()
                .min(minComparator);
        return hotel.get();
    }
}





