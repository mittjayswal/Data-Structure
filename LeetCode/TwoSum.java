package com.as.mitt.leetcode;

import java.util.HashMap;
import java.util.Map;


/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

public class TwoSum {

	public static void main(String[] args) {
		int array[] = {7,8,9,1,3};
		int target =  4;
		
		int ans [] = findPair(array,target);
		for (int i:ans) {
			System.out.print(i+",");
		}
	}

	private static int [] findPair(int[] nums, int target) {
		
		//-----------------Iterative way  O(n^2)
		/*for(int i=0; i<nums.length; i++) {
			for (int j=i+1;j<nums.length;j++) {
				if (nums[i]+nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;*/
		
		//-----------Best solution in O(n)
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i=0; i< nums.length; i++) {
			//check if the key is present that means we found the difference and store that index and i and then retuen
			if (map.containsKey(nums[i])) {
				return new int[] {map.get(nums[i]), i};
			}
			//find the difference and put it in map for future reference.
			int difference = target - nums[i];
			map.put(difference, i);
		}
		return null;
	}
}
