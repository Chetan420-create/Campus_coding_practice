package main.stringtraversal;

import java.util.HashMap;
import java.util.Map;

public class Task10 {

	public static void main(String[] args) {
		// Traverse two string and check whether they are anagram of each other
		
		String str1 = "worth";
		String str2 = "throw";
		System.out.println(isAnagram(str1,str2));

	}
	
	public static boolean isAnagram(String str1 , String str2) {
		
		if(str1.length()!=str2.length()) return false;   // check length of two string if not equal return false
		
		HashMap<Character,Integer> map1 = new HashMap<>();   // create map to check anagram
		
		// traverse string 
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);        //extract char from str1 
			char ch2 = str2.charAt(i);			//extract char from str2
			map1.put(ch, map1.getOrDefault(ch,0)+1); // put char of str1 in map and increament value
			map1.put(ch2,map1.getOrDefault(ch2,0)-1); // put char of str2 in map if already present decreament it
		}
		
		// traverse map
		for(Map.Entry<Character,Integer> map : map1.entrySet()) {
			
			//check every value is 0 if not then return false
			if(map.getValue()!=0) {
				return false;
				
			}
		}
		
		return true;
		

	}

}
