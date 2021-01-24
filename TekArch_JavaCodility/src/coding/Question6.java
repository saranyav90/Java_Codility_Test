package coding;
/*
 *6. Write a program to insert "tekarch" into vector then insert user inputed number(N) of Z's from 3rd position.
 *	delete N characters from 6th position from vector
 *	Example:if user input =5 Then vector stores="tekZZZZZarch"Delete 5 character from 6th position so final string="tekZZZh" 
 */

import java.util.Scanner;
import java.util.Vector;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Character> vec_tor = new Vector<Character>(); 
		vec_tor.add('t');
		vec_tor.add('e');
		vec_tor.add('k');
		vec_tor.add('a');
		vec_tor.add('r');
		vec_tor.add('c');
		vec_tor.add('h');
		
		// Displaying the Vector 
		System.out.println("Vector: " + vec_tor); 
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: "); 
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			vec_tor.insertElementAt('Z', i+3);
			
		}
		System.out.println("Vector: " + vec_tor); 
		for(int i=5;i<vec_tor.size();i++) {
			vec_tor.remove(i);
		}
		System.out.println("Vector: " + vec_tor); 
	}

}
