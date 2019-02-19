import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SeatHold {

	private int seatHoldId;
	private int reservationConfirmCode;
	private Map<String,List> customerMap= new HashMap<String,List>();
	
	
	
	public int getSeatHoldId() {
		return seatHoldId;
	}
	public void setSeatHoldId(int seatHoldId) {
		this.seatHoldId = seatHoldId;
	}
	public int getReservationConfirmCode() {
		return reservationConfirmCode;
	}
	public void setReservationConfirmCode(int reservationConfirmCode) {
		this.reservationConfirmCode = reservationConfirmCode;
	}
	public Map<String, List> getCustomerMap() {
		return customerMap;
	}
	public void setCustomerMap(Map<String, List> customerMap) {
		this.customerMap = customerMap;
	}	
	
}
