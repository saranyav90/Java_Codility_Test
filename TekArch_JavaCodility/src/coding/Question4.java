package coding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 4. Write a java program to store 5 unique elements in sorted order. 
 * Error should exist if user tries to add duplicates.
 * 
 */
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> uniques=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		uniques.add(sc.next());
		System.out.println(uniques);
	}

}
