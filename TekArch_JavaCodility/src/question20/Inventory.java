package question20;

import java.util.HashMap;
import java.util.Map;


public class Inventory {

	private Map<String,Integer> drinkInventory=new HashMap<>();
	private static Inventory single_instance=null;
	
	Inventory() {
		drinkInventory.put("coke", 20);
		drinkInventory.put("fanta", 30);
		drinkInventory.put("mango", 65);
		drinkInventory.put("orange", 39);
		drinkInventory.put("sprite", 50);
	}
	
	public static Inventory getInstance() {
		if(single_instance == null)
			single_instance = new Inventory();
		
		return single_instance;
	}
	
	public Map<String, Integer> getInventory() {
		return drinkInventory;
	}
	
	public void addInventory(Map<String,Integer> updateInventory) {
		 drinkInventory.putAll(updateInventory);
	}
	
	public  synchronized void  updateInventory(String name, Integer count){
		drinkInventory.put(name, count);
	}
}
