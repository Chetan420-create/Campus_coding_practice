package main.arraytraversal;

public class Task3 {

	public static void main(String[] args) {
		// Traverse an array and count how many even and odd numbers are present
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int a[] = countevenandodd(arr);
		System.out.println( "Count of even number "+a[0]);
		System.out.println( "Count of odd number "+a[1]);
	}
	
	public static int[] countevenandodd(int arr[]) {
		int even=0 , odd =0;
		int i=0;
		while(i<arr.length) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
			i++;
		}
		return new int[]{even ,odd};
	}

}
