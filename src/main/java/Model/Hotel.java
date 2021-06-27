package Model;

/**
 * Purpose : POJO for Hotel
 * @author Sanyukta
 * @version 1.0
 * @Since 26-06-2021
 * 
 *
 */
	public class Hotel {
		private String HotelName;
		private int rates;

	public Hotel(String hotelName, int rates) {
			this.HotelName = hotelName;
			this.rates = rates;
		}

		public String getHotelName() {
			return HotelName;
		}

		public void setHotelName(String hotelName) {
			HotelName = hotelName;
		}

		public int getRates() {
			return rates;
		}

		public void setRates(float rate) {
			this.rates = (int) rate;
		}

		@Override
		public String toString() {
			return "Hotel [HotelName=" + HotelName + ", rates=" + rates + "]";
		}
	}

