package main.arraytraversal;

public class Task9 {

	public static void main(String[] args) {
		// Traverse an array and move all 0s to the end while maintaining the order of non-zero elements . Do it in place
		int arr[] = {8,0,2,0,0,1,0,0,2,0,3,4,5,0,9};
		int newarr[] = MoveAllZeroToEnd(arr);
		for(int e  : newarr) {
			System.out.print(" "+e);
		}

	}
	
	public static int[] MoveAllZeroToEnd(int arr[]) {
		
		int insert=0;
		
		// all non zero element to first
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[insert] = arr[i];
				insert++;
			}
		}
		
		// add zero to remaining index
		while(insert<arr.length) {
			arr[insert] = 0;
			insert++;
		}
		return arr;
	}

}
