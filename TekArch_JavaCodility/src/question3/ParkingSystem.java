package question3;

/*
 * 3. Write a java program to implement vehicle parking application where 
 * information of each vehicle  which enters into the parking location is stored in 2 lists. 
 * At the end of each day these lists to be merged into single list and 
 *  vehicle information of the one which has highest parked hour should be retrieved, 
 * Each vehicle information has vehicle number, vehicle model, total duration parked in minutes.
 * 
 */

public class ParkingSystem {

	int vehNum;
	String vehModel;
	int time;
	
	ParkingSystem(int vehNum,String vehModel,int time){
		this.vehNum=vehNum;
		this.vehModel=vehModel;
		this.time=time;
	}
	
	
	
}
