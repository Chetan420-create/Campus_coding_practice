package main.arraytraversal;

public class Task5 {

	public static void main(String[] args) {
		// Traverse an array to check whether a given elements exits. If founds , print its index , otherwise print Not found
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(findElement(arr,9));

	}
	
	public static String findElement(int[] arr , int element) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]==element) {
				return "Element "+element +" present at index "+i;
			}
			i++;
		}
		return "Not Found";
	}

}
