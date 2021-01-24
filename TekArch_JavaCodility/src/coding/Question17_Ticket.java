package coding;
/*
 * 
 * 17. Implement ticket reservation application using multithreading where it has available seats information. 
 * Create 4 threads to access this data to book tickets and ensure data consistency 
 * Ex available seats=10 T1 requires 6 seats T2 requires 3 seats T2 requires 4 seats 
 * If available seats < seats required proper error message should get printed
 */

public class Question17_Ticket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread thread1=new Thread(new T1());
		Thread thread2=new Thread(new T2());
		Thread thread3=new Thread(new T3());
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();
	}

}


