package main.arraytraversal;

import java.util.HashMap;
import java.util.Map;

public class Task8 {

	public static void main(String[] args) {
		// Traverse an array and print the frequency of each element
		int arr[] = {1,2,4,2,1,7,1,7,5,4,6,7,8,6,4,3,4,55,6,5,4,3,2,2,33,3};
		HashMap<Integer , Integer> map = FrequencyOfElement(arr);
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +  " ------> "+entry.getValue());
		}
		
	}
	
	public static HashMap<Integer,Integer> FrequencyOfElement(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int count = 1; 
			for(int j=i+1;j<arr.length;j++) {
				if(!map.containsKey(arr[i])) {
					if(arr[i] == arr[j]) {
						count++;
					}
				}
			}
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
				count=1;
			}
		}
		return map;
	}
}
