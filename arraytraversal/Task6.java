package main.arraytraversal;

public class Task6 {

	public static void main(String[] args) {
		// Traverse the array in reverse order and print the elements without creating a new array
		int arr[] = {1,2,3,4,5,6,7,8,9};
		traverseReverse(arr);

	}
	
	public static void traverseReverse(int arr[]) {
		
		for(int i = arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		} 
	}
 
}
