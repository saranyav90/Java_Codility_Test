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

//When a class implements the Java Comparable interface, this means that instances (objects) of that class 
//can be compared to each other
public class Question2 implements Comparable<Question2>{

	
	String name;
	int marks;
	String regNo;
	
	//COnstructor
	public Question2(String name,int marks,String regNo) {
		this.name=name;
		this.marks=marks;
		this.regNo=regNo;
	}
	
	@Override
	public int compareTo(Question2 o) {
		// TODO Auto-generated method stub
		return o.marks-this.marks;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Question2> students=new ArrayList<Question2>();
		students.add(new Question2("John", 80, "100"));
		students.add(new Question2("Peter", 70, "101"));
		students.add(new Question2("Victor", 90, "102"));
		students.add(new Question2("Edward", 75, "103"));
		students.add(new Question2("Steve", 85, "104"));
		
		Collections.sort(students);
		int k = 1;
		for(Question2 s: students) {
			System.out.print(s.name+" with "+s.marks+" marks and RegNO:"+s.regNo+" got ");
			System.out.println("Rank :"+k);
			k++;
			
		}
		
	}


	

	

	 
}
