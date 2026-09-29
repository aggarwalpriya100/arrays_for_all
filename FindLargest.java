/*
🚀 Let's Start: Question 1
Find the Largest Element in an Array
Example : 
arr = [4, 7, 2, 9, 1]
Largest = 9


arr = [4, 7, 2, 9, 1]

max = 4

7 > 4  → max = 7
2 > 7  → No
9 > 7  → max = 9
1 > 9  → No

Answer = 9

*/

class Solution {
	public int findMax(int[]nums){
		int max = nums[0];
		for(int i = 1 ; i<nums.length ; i++){
			if(nums[i] > max){
				max = nums[i];
			}
		}
		return max ;
	}
}