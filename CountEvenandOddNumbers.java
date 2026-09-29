/*
🟢 Question 6/16 — Count Even and Odd Numbers
Example
arr = [2, 5, 8, 7, 10, 3]

Even numbers:

2, 8, 10 → 3

Odd numbers:

5, 7, 3 → 3
🧠 Main Logic

Use the modulus % operator.

If:

arr[i] % 2 == 0

➡️ Number is even.

arr = [2, 5, 8, 7, 10, 3]

2 % 2 = 0 → even = 1
5 % 2 ≠ 0 → odd = 1
8 % 2 = 0 → even = 2
7 % 2 ≠ 0 → odd = 2
10 % 2 = 0 → even = 3
3 % 2 ≠ 0 → odd = 3
*/
class Solution {
	public int countEvenOdd(int[]nums){
		int evenCount = 0 ;
		int oddCount = 0 ;
		for(int i = 0 ; i<nums.length ; i++){
			if(nums[i]%2 == 0){
				evenCount++;
			}else{
				oddCount++;
			}
		}
		System.out.println("Even :" +evenCount);
		System.out.println("Odd : " +oddCount);
	}
}