/*
Find Second Smallest Element
Example
arr = [10, 5, 8, 20, 15]

Smallest = 5
Second smallest = 8

🧠 Main Logic

This is the opposite of second largest.

Maintain:

int smallest = Integer.MAX_VALUE;
int secondSmallest = Integer.MAX_VALUE;

For every element:

If current < smallest:

secondSmallest = smallest;
smallest = arr[i];

Otherwise, if current lies between the two:

else if (arr[i] < secondSmallest && arr[i] != smallest) {
    secondSmallest = arr[i];
}

*/

class Solution{
	public int secondSmallest(int[]nums){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE ;
		for(int i = 0 ; i < nums.length ; i++){
			if(nums[i]<smallest){
				secondSmallest = smallest;
				smallest = nums[i];
			}else if(nums[i] < secondSmallest && nums[i] != smallest){
				secondSmallest = nums[i];
			}
		}
		return secondSmallest;
	}
}