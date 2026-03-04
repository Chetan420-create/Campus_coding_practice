package main.stringtraversal;

public class Task9 {

	public static void main(String[] args) {
		// Traverse a string and find the longest continuous sequence of the same character
		
		String str = "aaabbbbcccccd";
		System.out.println(LongestContinCharSeq(str));

	}
	
	public static String LongestContinCharSeq(String str) {
		 int maxcount = 1;   //initialize maximum count of characters	 
		 int currentcount = 1;  // initializing current count of characters
		 char ch = str.charAt(0);     // initialize the maximum sequence of  characters
		 
		 // traverse the string from index 1 
		 for(int i=1;i<str.length();i++) {
			 
			 // compare the characters with previous characters
			 if(str.charAt(i) == str.charAt(i-1)) {
				 currentcount++;               // Increment current count if character is repeat
			 }else {
				 currentcount=1;      // reset current count if character not match
			 }
			 
//			 check max count of characters with  current count 
			 if(maxcount<currentcount) {
				 maxcount = currentcount;     // assign max count 
				 ch = str.charAt(i);         // store maximum repeating character
			 }
		 }
		 
		 return String.valueOf(ch).repeat(maxcount);  // return max repeating substring 
	}

}
