/*

🟠 Question 15/16 — Find the Duplicate Number (LC 287)

This one is a little different from the previous questions.

Problem

You are given an array containing n + 1 integers where every number is in the range:

1 to n

There is exactly one repeated number. Find it.

Example
nums = [1, 3, 4, 2, 2]

Here 2 appears twice.

✅ Answer = 2

🧠 Best Logic — Floyd's Cycle Detection

This is the important part.

We treat the array like a linked list.

For:

nums = [1, 3, 4, 2, 2]

Think:

0 → 1 → 3 → 2 → 4
        ↑       ↓
        └───────┘

Because:

nums[0] = 1
nums[1] = 3
nums[3] = 2
nums[2] = 4
nums[4] = 2

The duplicate creates a cycle.

So we can use Floyd's slow and fast pointer algorithm.

Step 1 — Find the Meeting Point
int slow = nums[0];
int fast = nums[0];

do {
    slow = nums[slow];
    fast = nums[nums[fast]];
} while (slow != fast);
slow moves one step
fast moves two steps

Eventually they meet inside the cycle.

Step 2 — Find the Duplicate

Reset one pointer to the beginning:

slow = nums[0];

Then move both one step at a time:

while (slow != fast) {
    slow = nums[slow];
    fast = nums[fast];
}

When they meet again: 
*/ 

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0] ;
		int fast = nums[0] ;
		//Step 1 :-> Find the meeting point
		do{
			slow = nums[slow] ;
			fast = nums[nums[fast]];
		}while(slow !=fast);
		
		// Step 2 :-> Find the entrance cycle 
		slow = nums[0];
		while(slow != fast) {
			slow = nums[slow] ;
			fast = nums[fast] ;
		}
		return slow ;
    }
}