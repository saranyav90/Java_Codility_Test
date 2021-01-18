package coding;

import java.util.ArrayList;

/*
 * 7. Write a java program to implement your own ArrayList which has two methods 
 * 		a) add b) remove and store 5 student information in your ArrayList.
 */

public class Question7 {

	
	int n=5;
	
	// the custom datatype class
	class Data{
		// global variables of the class 
		int roll;
		String name;
		int marks;
		
		//COnstructor
		public Data(int roll,String name,int marks) {
			this.roll=roll;
			this.name=name;
			this.marks=marks;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] roll= {1,2,3,4,5};
		String[] name= {"John", "Peter","Victor","Edward","Steve"};
		int[] marks= {80,70,90,75,85};
		
		// Create an object of the class 
		Question7 customClass=new Question7();
		customClass.addValues(roll,name,marks);
		customClass.removeValues();
	}

	  void removeValues() {
		// TODO Auto-generated method stub
		
	}

	void addValues(int[] roll, String[] name, int[] marks) {
		// TODO Auto-generated method stub
		ArrayList<Data> dataList=new ArrayList();
		for(int i=0;i<n;i++) {
			dataList.add(new Data(roll[i],name[i],marks[i]));
			Data data = dataList.get(i); 
			System.out.println(data.roll+"  "+data.name+"  "+data.marks);
		}
		
	}

}
