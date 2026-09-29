/*
🟠 Question 10/16 — Remove Duplicates from Sorted Array (LC 26)

This is another two-pointer problem. 🔥

Problem

Given a sorted array, remove duplicates in-place so that every element appears only once.

Example:

Input:  [1, 1, 2, 2, 3, 4, 4]

Output: [1, 2, 3, 4]

The important thing: the array is already sorted.

🧠 Main Logic

We use two pointers:

int i = 0;

i represents the position of the last unique element.

Then start j from index 1:

for (int j = 1; j < nums.length; j++)

Whenever:

nums[j] != nums[i]

we found a new unique element.

So:

i++;
nums[i] = nums[j];

At the end, the number of unique elements is: 
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1 ;
		for(int i=1 ; i<nums.length ; i++){
			if(nums[i] != nums[j-1]){
				nums[j] = nums[i];
				j++;
		}
    }
	return j; 
	}
}