package coding;

import java.util.TreeMap;

/*
	 * 1. Write a java program to store 5 student information in a treeMap
	 * Note: student object has student name and student reg no
	 */

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"John");    
	      map.put(102,"Peter");    
	      map.put(101,"Robert");    
	      map.put(103,"Victor");    
	      map.put(104,"Paul"); 
	      System.out.println(map);
	}

}
