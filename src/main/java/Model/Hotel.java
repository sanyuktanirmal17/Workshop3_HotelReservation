package Model;

/**
 * Purpose : POJO for Hotel
 * @author Sanyukta
 * @version 1.0
 * @Since 26-06-2021
 * 
 *
 */
public class Hotel implements Comparable<Hotel> {
    private String HotelName;
    private float rate;
    private float weekendRate;

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelname) {
        this.HotelName = HotelName;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(float weekendRate) {
        this.weekendRate = weekendRate;
    }



    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + HotelName + '\'' +
                ", rate=" + rate +
                ", weekendRate=" + weekendRate +'}';
    }


    @Override
    public int compareTo(Hotel h) {
        return (int) (this.rate - h.rate);
    }


}