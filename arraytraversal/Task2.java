package main.arraytraversal;

public class Task2 {

	public static void main(String[] args) {
		// traverse an array and calculate the sum of all elements
		
		// The time complexity of this is O(N). N is number of array element and loop is traverse as number of elements 
		double arr[] = {3,5,4,2,3,4,3.6,6.5,4,3,32,223.89,56};
		System.out.println(calculatesum(arr));

	}
	
	public static double calculatesum(double arr[]) {
		int l = arr.length;
		double sum =0;
		int i=0;
		while(i<l) {
			sum += arr[i];
			
			i++;
		}
		return sum;
	}
}
