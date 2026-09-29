/*
Find the Smallest Element
Example : arr = [4, 7, 2, 9, 1]
1 

arr = [4, 7, 2, 9, 1]

min = 4

7 < 4 → No
2 < 4 → min = 2
9 < 2 → No
1 < 2 → min = 1

Answer = 1

*/

class Solution{
	public int findMin(int[]nums){
		int min = nums[0];
		for(int i = 1 ; i < nums.length ; i++){
			if(min > nums[i]){
				min = nums[i];
			}
		}
		return min ;
	}
}