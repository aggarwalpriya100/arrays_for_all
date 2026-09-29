/*
🟢 Question 5/16 — Sum of Array Elements
Example
arr = [2, 4, 6, 8]

We need:

2 + 4 + 6 + 8 = 20

🧠 Main Logic

We need a variable sum to keep adding every element.

Start with:

int sum = 0;

Then traverse:

sum = sum + arr[i];

arr = [2, 4, 6, 8]

sum = 0

2 → sum = 2
4 → sum = 6
6 → sum = 12
8 → sum = 20

*/

class Solution{
	public int arraySum(int[]nums){
		int sum = 0 ;
		for(int i = 0 ; i<nums.length ; i++){
		sum = sum + nums[i];
		}
		return sum ;
	}
}