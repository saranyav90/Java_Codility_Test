package coding;

import java.util.Arrays;


/*
 * 
 * 19. What is stable algorithm? write an algorithm for quicksort.
 * 		 sort the fallowing using quicksort. 50 70 10 40 50
 * 		Is quick sort is stable algorithm? if not give reason. 
 * 
 * 
 * 		ANSWER : A sorting algorithm is said to be stable ,
 * 					if it maintains the relative order of records in the case of equality of keys
 * 		Quick sort is not a stable algorithm because the swapping of elements is done according to pivot’s position 
 * 		(without considering their original positions)
 */
public class Question19 {

	public static void main(String[] args) {
		int[] a= {7,6,5,4,3,2,1,0};   
		doQuickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public static void doQuickSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {  //if a segment(or partition) has only one element left, stop recursion.
			int partitionIndex=doPartition(a,start,end);
			doQuickSort(a, start, partitionIndex-1);
			doQuickSort(a, partitionIndex+1, end);
		}
	}

	public static int doPartition(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=a[end];
		int partitionIndex=start;
		for(int i=start;i<end;i++) {
			if(a[i]<=pivot) {
				swap(a,a[i],a[partitionIndex]);
				partitionIndex++;
			}
		} // END OF FOR LOOP
		swap(a,a[partitionIndex],a[end]); // swap no at partition Index with Pivot ,
		return partitionIndex;            // and then return partition Index
	}
	
	// FUNCTION TO SWAP NUMBERS
		private static void swap(int[] a,int a2, int a3) {
			// TODO Auto-generated method stub
			int temp=a[a2];
			a[a2]=a[a3];
			a[a3]=temp;
			
		}

}
