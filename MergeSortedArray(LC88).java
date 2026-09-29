/*

🟠 Question 13/16 — Merge Sorted Array (LC 88)

This is another two-pointer pattern, but here we use the pointers from the end.

Problem

You are given two sorted arrays:

nums1 = [1, 2, 3, 0, 0, 0]
nums2 = [2, 5, 6]

Here:

m = 3
n = 3

The first m elements of nums1 are actual values. The remaining positions are empty space for nums2.

We need:

[1, 2, 2, 3, 5, 6]
🧠 Main Logic — Start From the End

Why from the end?

Because nums1 already has empty spaces at the end.

Use three pointers:

i = m - 1;
j = n - 1;
k = m + n - 1;

Meaning:

i → last actual element of nums1
j → last element of nums2
k → last position of nums1

Compare:

nums1[i] > nums2[j]

Put the larger element at nums1[k].

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(i>=0 && j>=0){
			if(nums1[i] >nums2[j]){
				nums1[k] = nums1[i] ;
			i--;
			}else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
    }
	while(j>=0){
		nums1[k] = nums2[j];
		j--;
		k--;
		}
	}
}