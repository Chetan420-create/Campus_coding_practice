package main.stringtraversal;

import java.util.HashMap;
//import java.util.Map;

public class Task4 {

	public static void main(String[] args) {
		// Traverse a string and find the frequency of each character (Assume only lower case alphabets)
		
//		HashMap<Character,Integer> map = CharFrequency("Chetan bhankhede");
//		for(Map.Entry<Character, Integer> ma : map.entrySet()) {
//			System.out.println(ma.getKey()+" : "+ma.getValue());
//		}
		
		CharFreq("Jagadambha college of engineering and technology");
	}
	
	// using array
	public static void CharFreq(String str) {
		int freq[]=new int[26]; // initialize array if integer of size 26
		
		//traverse string
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);       // extract character
			if(ch >= 'a' && ch <='z') {    // check character is lower case
				freq[ch-'a']++;            // increase its count 
			}
		}
		
		// traverse the array
		for(int j=0;j<freq.length;j++) {
			if(freq[j]>0) {                      // check the element which are present in string
				char ch =   (char) (j+'a');						// convert to char
				System.out.println(ch +" : "+freq[j]);   //print frequency count
			}
		} 
	}
	
	// using hash map
	public static HashMap<Character , Integer> CharFrequency(String str){
		HashMap<Character , Integer> map = new HashMap<>();  // create hash map
		// traverse the string
		for(int i=0;i<str.length();i++) {
			
			if(Character.isWhitespace(str.charAt(i))) continue;  // check for whitespace
			
			// check whether the key is already present or not
			if(map.containsKey(str.charAt(i))) {
				map.replace(str.charAt(i), map.get(str.charAt(i))+1);  // increment value
				
				//check character is lower case 
			}else if(Character.isLowerCase(str.charAt(i))){     
				map.put(str.charAt(i),1);  // put into map
			}
		}
		return map;

	}

}
