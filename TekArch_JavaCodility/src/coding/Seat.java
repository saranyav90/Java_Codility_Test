package coding;

import java.util.HashMap;
import java.util.Map;

public class Seat {

	private Map<String,Integer> SeatsAvailable = new HashMap<>();
	private static Seat single_instance = null; 
	
	private Seat() {
		SeatsAvailable.put("seats", 10);	
	}
	
	
	public static Seat getInstance() {
		if(single_instance==null) {
			single_instance=new Seat();
		}
		
		return single_instance;
	}
	
	public Map<String,Integer> getSeats() {
		
		return SeatsAvailable;
	}
	
	public void addSeats(Map<String,Integer> updatedseatings) {
		SeatsAvailable.putAll(updatedseatings);
	}
	
	public  synchronized void updateSeats(String seat, Integer count) {
		SeatsAvailable.put(seat, count);
	}

}
