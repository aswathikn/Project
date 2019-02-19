import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class TicketReservation implements TicketService {

SeatHold seatHold= new SeatHold();
List<Integer> totalSeats= new ArrayList<Integer>();
List<Integer> seatNumbers= new ArrayList<Integer>();
int[] seats=new int[100];
int totNumSeats=100;
static boolean isFirst=true;
static Map<Integer, String> seatsAvailableMap= new HashMap<Integer, String>();
Map<String,List> customerMap= new HashMap<String,List>();
	


@Override
public SeatHold findAndHoldSeats(int numSeats, String customerEmail) {
	for(int i=0;i<totNumSeats;i++){
		if((seatsAvailableMap.get(i).equals("Available")))
			{
			seatsAvailableMap.put(i, "UnAvailable");
			seatNumbers.add(i);
			--numSeats;
			if(numSeats<=0)
				break;
			}
		}
	customerMap.put(customerEmail,seatNumbers);
	seatHold.setCustomerMap(customerMap);
	System.out.println("customerMap>>"+customerMap);
	System.out.println("seatHold>>"+seatHold);
	return seatHold;
}

@Override
public String reserveSeats(int seatHoldId, String customerEmail) {
	List<Integer> seatNumbersAllocated=(List<Integer>)customerMap.get(customerEmail);
	String reservationCode= customerEmail;
	for(Integer seats:seatNumbersAllocated){
		reservationCode=reservationCode+" "+seats;
	}	
	return reservationCode;
}

@Override
public int numSeatsAvailable() {
	if(isFirst){//assume 100 seats are available before booking starts
		for(int i=0;i<totNumSeats;i++){
		seatsAvailableMap.put(i, "Available");
		}
		isFirst=false;				
	}	
	for(int i=0;i<totNumSeats;i++){
		if((seatsAvailableMap.get(i)).equals("UnAvailable")){
			totNumSeats--;
		}	
		}
	System.out.println("seatsAvailableMap>>"+seatsAvailableMap); 
	return totNumSeats;
	}
}	
