package main.stringtraversal;

public class Task5 {

	public static void main(String[] args) {
		// Traverse a string using two pointers and check whether it is a palindrome
		System.out.println(isPalindrome("amadama"));
	}
	
	
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)==str.charAt(right)) {
				left++;
				right--;
			}else {
				return false;
			}
		}
		return true;
	}

}
