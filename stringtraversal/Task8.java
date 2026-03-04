package main.stringtraversal;

public class Task8 {

	public static void main(String[] args) {
		// Traverse a sentence and count the total number of words without using split
		
		String sentence = " jay is account manager  ";
		System.out.println(CountWords(sentence));
	}
	
	public static int CountWords(String str) {
		str =	str.trim();//remove first and last space
		
		// check the string is black 
		if(str.isBlank()) {
			return 0;
		}
		
		// initialize count to count space
		int count = 0;
		
		//traverse string
		for(int i=0;i<str.length()-1;i++) {
			char ch = str.charAt(i);            //extract character
			// check space
			if(Character.isWhitespace(ch)) {
				count++;  //Increment count if space occur 
			}
			
			// check continuous space 
			if(Character.isWhitespace(ch) && Character.isWhitespace(str.charAt(i+1))) {
				count--;  // Decrement count if double space occur
			}
			
			
		}
		return count+1;  // return count by adding 1 
	}

}
