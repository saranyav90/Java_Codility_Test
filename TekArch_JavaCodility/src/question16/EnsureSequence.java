package question16;

public class EnsureSequence  {
	
	public static void main(String[] args) {
		final Thread T1,T2,T3;
		
		T1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Starting thread 1");
				System.out.println("Ending thread 1");
			}
			
		});
		
		T2=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Starting thread 2");
				
				try {
					T1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ending thread 2");
			}
			
		});
		
		T3=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Starting thread 3");
			
				try {
					T2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ending thread 3");
			}
			
		});
		
		//Starting threads
		T3.start();
		T2.start();
		T1.start();
			
	}
}
