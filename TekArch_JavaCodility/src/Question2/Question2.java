package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/*
 * 2. Write a java program to store 5 student information 
 *    and award the students with 1st rank, 2nd rank and 3rd rank according to marks obtained,
 *    where each student has student name, student marks and student reg no information.
 * 
 */
public class Question2{

	int n=5;
	// the custom datatype class
class Student {
	String name;
	int marks;
	String regNo;
	
	//COnstructor
	public Student(String name,int marks,String regNo) {
		this.name=name;
		this.marks=marks;
		this.regNo=regNo;
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"John", "Peter","Victor","Edward","Steve"};
		int[] marks= {80,70,90,75,85};
		String[] regNo= {"100","101","102","103","104"};
		Question2 studentData=new Question2();
		studentData.rankValues(name,marks,regNo);
	}

	void rankValues(String[] name, int[] marks, String[] regNo) {
		// TODO Auto-generated method stub
		 ArrayList<Student> dataList=new ArrayList();
			for(int i=0;i<n;i++) {
				dataList.add(new Student(name[i],marks[i],regNo[i]));
				
				Student data = dataList.get(i); 
				Map pairs=new HashMap();
				pairs.put( data.regNo,data.marks);
				
				System.out.println(data.name+"  "+data.marks+"  "+data.regNo);
			}
	}

	 
}
