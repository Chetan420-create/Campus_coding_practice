package main.stringtraversal;

public class Task3 {

	public static void main(String[] args) {
		// Traverse a string from end to start and print the reverse string without using built in reverse methods
		System.out.println(ReverseString("Chetan"));
	}
	
	public static String ReverseString(String str) {
		// initialize the new string
		String newstr = "";
		
		//traverse the string in reverse order
		for(int i=str.length()-1;i>=0;i--) {
			
			// add characters to a new string by converting to string
			newstr = newstr.concat(String.valueOf(str.charAt(i)));
		}
		return newstr; // return new string;
	}

}
