/*Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.

 

​​​​​​​Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
*/

class Solution {
	public int maxProduct(int[]nums){
		int maxProduct = nums[0];
		int minProduct = nums[0];
		int answer = nums[0];
		for(int i = 1 ; i <nums.length ;i++){
			int current = nums[i];
			int tempMax = Math.max(current , Math.max(current * maxProduct , current * minProduct) );
			int tempMin = Math.min(current , Math.min(current * maxProduct , current * minProduct));
			maxProduct = tempMax ;
			minProduct = tempMin ;
			answer = Math.max(answer , maxProduct);
		}
		return answer ;
	}
}