package coding;

public class T1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method1();
		
	}
	
	public synchronized void method1() {
		int numberOfBookings=6;
		Seat seat=Seat.getInstance();
		
		seat.getSeats();
		
		if(seat.getSeats().get("seats")!=null && numberOfBookings<seat.getSeats().get("seats")) {
			seat.updateSeats("seats", seat.getSeats().get("seats") - numberOfBookings);
			
			System.out.println("seats reserved");
			System.out.println("remaining seats: "+seat.getSeats().get("seats"));
		}
		
		else
			System.out.println("Seats are not available");
		
		
	}
	
	

}
