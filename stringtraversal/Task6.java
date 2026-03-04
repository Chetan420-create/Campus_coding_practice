package main.stringtraversal;

import java.util.HashMap;

public class Task6 {

	public static void main(String[] args) {
		// Traverse a String and find the first non repeating character. 
		// if not exit,print -1
		
		System.out.println(FirstNonRepeatchar("checthentn"));
	}
	
	public static char FirstNonRepeatchar(String str) {
		HashMap<Character , Integer> map = new HashMap<>(); // create hashmap
		//traverse the string
		for(char ch : str.toCharArray()) {
			map.put(ch,map.getOrDefault(ch, 0)+1); // put into map
		}
		
		// traverse string again
		for(char ch : str.toCharArray()){
			if(map.get(ch)==1) {   // check which character is non repeating and occur first
			return ch;             // return character
			}
		}
		
		return '1';
	}

}
