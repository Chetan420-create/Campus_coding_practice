package main.arraytraversal;

public class Task7 {

	public static void main(String[] args) {
		// Find the second largest element in an array using a single traversal
		int arr[]= {1,2,5,4,8,3};
		System.out.println(secondLargestEle(arr));
		System.out.println(Long.MIN_VALUE);

	}
	
	public static int secondLargestEle(int arr[]) {
		int second = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > largest) {
				second = largest;
				largest = arr[i];
			}else if(arr[i] > second && arr[i] != largest) {
				second = arr[i];
			}
		}
		
		return second; 
		
	}

}
