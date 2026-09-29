/*
🟢 Question 7/16 — Reverse an Array

This is an important two-pointer pattern. 🔥

Example
arr = [1, 2, 3, 4, 5]

After reversing:

[5, 4, 3, 2, 1]

🧠 Main Logic — Two Pointers

Take two pointers:

int left = 0;
int right = arr.length - 1;

Then swap the elements at left and right.

After swapping:

left++
right--

Continue until:

left < right

arr = [1, 2, 3, 4, 5]

left = 0
right = 4 
*/

class Solution{
	public int reverse(int[]nums){
		// We use 2 pointer technique for reversing 
		int left = 0 ;
		int right = nums.length-1;
		while(left<right){
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp ;
			left++;
			right--;
		}
		
	}
}