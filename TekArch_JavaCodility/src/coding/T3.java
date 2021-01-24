package coding;

public class T3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method3();
	}

	public synchronized void method3() {
		// TODO Auto-generated method stub
		int numberOfBookings=4;
		Seat seat=Seat.getInstance();
		
		seat.getSeats();
		
		if(seat.getSeats().get("seats")!=null && numberOfBookings<seat.getSeats().get("seats")) {
			seat.updateSeats("seats", seat.getSeats().get("seats") - numberOfBookings);
			
			System.out.println("seats reserved");
			System.out.println("Remaining seats: "+seat.getSeats().get("seats"));
		}
		
		else
			System.out.println("Seats are not available");
		
		
	
	}

}
