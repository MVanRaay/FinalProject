package mypack;

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int nums[] = {10, 20, 5, 0, -1, 30};
		int targetSum = 50;
		int[] results = getPair(nums, targetSum);
		int[] results2 = getPairOptimized(nums, targetSum);
		
		System.out.println("The required incidices which add up to " + targetSum + " are: " + results[0] + "," + results[1]);
		System.out.println("The required incidices which add up to " + targetSum + " are: " + results2[0] + "," + results2[1]);
	}
	
	private static int[] getPair(int[] nums, int targetSum) {
		int[] results = {-1, -1};
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == targetSum) {
					results[0] = i;
					results[1] = j;
				}
			}
		}
		
		return results;
	}
	
	private static int[] getPairOptimized(int[] nums, int targetSum) { // map: key=number, value=index
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] results = {-1, -1};
		
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int compliment = targetSum - num;
			if (map.containsKey(compliment)) {
				results[0] = i;
				results[1] = map.get(compliment);
				break;
			} else {
				map.put(num, i);
			}
		}
		
		return results;
	}
}