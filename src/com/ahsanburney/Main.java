package com.ahsanburney;

import java.util.HashMap;
import java.util.Map;

public class Main {

//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    public static void main(String[] args) {
	// write your code here
        int nums[] ={2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums,target));
    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }

        return new int[]{0,0};
    }
}
