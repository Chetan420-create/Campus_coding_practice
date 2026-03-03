package main.arraytraversal;

public class Task1 {

	public static void main(String[] args) {
		// Write a java program to traverse an integer array and print all elements using for loop ,enhanced for-each loop
		int arr[] = {3,5,4,2,3,4,6,65,4,3,32,223,56};
		printelements1(arr);

	}
	
	public static void printelements(int[] arr) {
		int l = arr.length;
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]);
		}
		
	} 
	
	public static void printelements1(int[] arr) {
		
		for(int each : arr) {
			System.out.println(each);
		}
		
	} 
 
}
