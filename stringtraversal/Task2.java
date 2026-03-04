package main.stringtraversal;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {
		// Traverse a string and count the number of vowels , consonants , digits and spaces
		Map<String,Integer> map = CountVowelConsonantDigitSpace("Chetan Bhankhede 123 ");
		for(Map.Entry<String , Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
	
	public static HashMap<String , Integer> CountVowelConsonantDigitSpace(String str){
		Map<String , Integer> map = new HashMap<>();
		map.put("space", 0);
		map.put("consonant",0);
		map.put("digit",0);
		map.put("vowels",0);
		for(int i=0;i<str.length();i++){
		char ch = str.charAt(i);
			if(Character.isWhitespace(ch)) {
				map.replace("space",map.get("space")+1);
			}else if(ch == 'a' || ch=='e' || ch =='i'||ch=='o'||ch=='u') {
				map.replace("vowels", map.get("vowels")+1);
			}else if(Character.isDigit(ch)) {
				map.replace("digit", map.get("digit")+1);
			}else {
				map.replace("consonant", map.get("consonant")+1);
			}
		}
		return (HashMap<String, Integer>) map;
	}

}
