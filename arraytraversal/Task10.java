package main.arraytraversal;

public class Task10 {

	public static void main(String[] args) {
		// Traverse the array and check whether it is sorted in ascending order return true or false
		int arr[] = {1,2,3,4,56,9};
		System.out.println(CheckArrSort(arr));
	}
	
	public static boolean CheckArrSort(int arr[]) {
		boolean check = false;
		// traverse the array
		for(int i=0;i<arr.length-1;i++) {
			//check array is sorted or not
			if(arr[i] < arr[i+1]) {
				check = true;
			}else {
				check = false;
			}
		}
		return check;
	}

}
