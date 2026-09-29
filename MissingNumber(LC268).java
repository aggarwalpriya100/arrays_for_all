/*
🟠 Question 14/16 — Missing Number (LC 268)

This one is very important and has a beautiful math pattern. 🔥

Problem

You are given an array containing n distinct numbers taken from:

0 to n

One number is missing. Find it.

Example
nums = [3, 0, 1]

Numbers should be:

0, 1, 2, 3

Missing:

2
*/

class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length ;
		for(int i = 0 ; i< nums.length ; i++){
			xor = xor ^ i ^ nums[i] ;
    }
	return xor ;
	}
}