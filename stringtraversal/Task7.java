package main.stringtraversal;

import java.util.HashSet;

public class Task7 {

	public static void main(String[] args) {
		// Traverse a string and remove duplicates characters ,keeping only the first occurrence
		System.out.println(RemoveDuplicateChar("aabbccvvjkjl"));
		System.out.println(removeduplicate("rpropgraming"));
	}
	
	
	public static String removeduplicate(String str) {
		StringBuilder res = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				res.append(str.charAt(i));
			}
		}
		return res.toString();
	}
	
	
	public static String RemoveDuplicateChar(String str) {
		//create new string
		String str1 = "";
		//traverse the string
		for(int i=0;i<str.length();i++) {
			
			//extract character
			char ch  = str.charAt(i);

			// check duplicate
			if(!str1.contains(String.valueOf(ch))) {
			str1 =	str1.concat(String.valueOf(ch));   // add character to new string
			}
		}
		
		return str1;
		
	}

}
