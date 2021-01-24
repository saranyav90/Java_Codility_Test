package question20;

/*
 * Write a java code for the following 
 * 	Store n number of drinktype with quantity. 
	If user wants a drink, user should enter drinktype. 
	If drink quantity is greater than one then request should be served and 
	decrease the corresponding quantity by one ,else no availability message should be printed on screen
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfOrders=3;
		
		Inventory inv=Inventory.getInstance();
		
		inv.getInventory();
		
		if (inv.getInventory().get("coke") != null && numberOfOrders < inv.getInventory().get("coke")) {
			inv.updateInventory("coke", inv.getInventory().get("coke") - numberOfOrders);
			
			System.out.println(numberOfOrders+" Drink(s) served to user");
			System.out.println("Remaining stock: "+inv.getInventory().get("coke")+" drinks");
		} 
		else {
			System.out.println("Out of stock");
		}

		
		
	}

}
