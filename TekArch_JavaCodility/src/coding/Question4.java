package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * 4. Write a java program to store 5 unique elements in sorted order. 
 * Error should exist if user tries to add duplicates.
 * 
 */
public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet ts=new TreeSet();
		System.out.println("Enter number: ");
		int count=1;
		int n=0;
		do {
			n=sc.nextInt(); 
			if(ts.contains(n)) {
				System.out.println(" duplicates not allowed !");
				continue;
			}
			else {
					ts.add(n);
					
			}
			System.out.println(ts);
		}
		while(ts.size()<=4);
		
		
		
		
	}

	
	 

}
