import java.util.List;
import java.util.Scanner;


public class Reservation {

	public static void main(String[]args)
	{
		 TicketReservation t = new TicketReservation();
		 String reserve="Yes";
		 while(reserve.equals("Yes"))
		 {
		 System.out.println("Number of Available Tickets is"+t.numSeatsAvailable());
		 System.out.println("Enter numSeats");
		 Scanner numSeatsScan=new Scanner(System.in);
		 int numSeats=numSeatsScan.nextInt();
		 System.out.println("Enter customerEmail");
		 Scanner customerEmailScan=new Scanner(System.in);
		 String customerEmail=customerEmailScan.nextLine();
		 SeatHold seatHold=(SeatHold)t.findAndHoldSeats(numSeats, customerEmail);
		 System.out.println("Customer and seat Information");
		 System.out.println("customerEmail:"+customerEmail);
		 System.out.println("numSeats:"+numSeats);
		 System.out.println("Seats Allocated:");
		 System.out.println(t.reserveSeats(0,customerEmail));
		 System.out.println("Do you want tomake more reservations? Yes/No");
		 Scanner reserveSacn=new Scanner(System.in);
		 reserve=reserveSacn.next();
		 }
	}
}
