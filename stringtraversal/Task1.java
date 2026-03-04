package main.stringtraversal;

public class Task1 {

	public static void main(String[] args) {
		// Write a java program to traverse a string and print each character on a new line
		printChar("Harsh");
		

	}
	
	public static void printChar(String str) {
		//travers the string
		for(int i=0;i<str.length();i++) {
	
			System.out.println(str.charAt(i));  // print character
		}
	}

}
