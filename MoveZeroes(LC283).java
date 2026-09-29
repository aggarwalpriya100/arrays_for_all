/*
🟠 Question 9/16 — Move Zeroes (LC 283)

Now Pattern 2: Array Manipulation starts. 🔥

Problem

Move all 0s to the end of the array while keeping the relative order of non-zero elements unchanged.

Example:

Input:  [0, 1, 0, 3, 12]

Output: [1, 3, 12, 0, 0]
🧠 Main Logic — Two Pointers

We use a pointer j to represent the position where the next non-zero element should go.

int j = 0;

Traverse the array using i.

Whenever:

arr[i] != 0

swap arr[i] with arr[j], then move j.
*/

class Solution{
	public void moveZeroes(int[]nums){
		int  j = 0 ;
		for(int i = 0 ; i<nums.length ; i++){
			if(nums[i] != 0){
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp ; 
				j++;
			}
		}
	}
}