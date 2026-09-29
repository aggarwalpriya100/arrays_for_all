/*

Example
arr = [10, 5, 8, 20, 15]

Largest = 20
Second largest = 15

🧠 Main Logic

We maintain two variables:

int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

For every element:

Case 1: Current element is greater than largest

Then:

secondLargest = largest
largest = arr[i]

Because the old largest becomes the second largest.

Case 2: Current element is between largest and second largest
arr[i] < largest
AND
arr[i] > secondLargest

Then update:

secondLargest = arr[i]

*/

class Solution{
	public int secondLargest(int[]nums){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < nums.length ; i++){
			if(nums[i] > largest){
				secondLargest = largest;
				largest = nums[i];
			}else if(nums[i] > secondLargest && nums[i] != largest){
				secondLargest = nums[i];
			}
		}
		return secondLargest;
	}
}
