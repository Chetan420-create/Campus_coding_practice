package main.arraytraversal;

public class Task4 {

	public static void main(String[] args) {
		// Traverse an array only once and find the largest and smallest elements
		int arr[] = {34,87,65,23,11,89,67};
		int h[] = findLargSmal(arr);
		System.out.println("Large element : "+h[0]);
		System.out.println("Small element : "+h[1]);

	}
	
	public static int[] findLargSmal(int arr[]) {
		int large = arr[0];
		int small = arr[0] ;
		for(int i=1;i<arr.length;i++) {
			if(large < arr[i]) {
				large = arr[i];
			}else if(small > arr[i]) {
				small = arr[i];
			}
		}
		
		return new int[] {large,small};
		
	}

}
