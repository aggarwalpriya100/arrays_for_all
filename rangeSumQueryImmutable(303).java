/*
LeetCode 303 — Range Sum Query - Immutable. The main concept is Prefix Sum.

1. What problem are we solving?

Suppose:

nums = [1, 2, 3, 4, 5]

If someone asks:

sumRange(1, 3)

we need:

2 + 3 + 4 = 9

A simple approach would calculate the sum every time. But if there are many queries, that's inefficient.

So we create a prefix sum array.

2. What is prefix?

Your code:

private int[] prefix;

This array stores the sum of all elements from index 0 up to the current index.

For:

nums = [1, 2, 3, 4, 5]

we create:

prefix = [1, 3, 6, 10, 15]

Because:

prefix[0] = 1

prefix[1] = 1 + 2 = 3

prefix[2] = 1 + 2 + 3 = 6

prefix[3] = 1 + 2 + 3 + 4 = 10

prefix[4] = 1 + 2 + 3 + 4 + 5 = 15
3. Constructor
public NumArray(int[] nums) {

This constructor receives the original array.

Create prefix array
prefix = new int[nums.length];

If:

nums.length = 5

then:

prefix = [0, 0, 0, 0, 0]
First element
prefix[0] = nums[0];

For:

nums = [1, 2, 3, 4, 5]

we get:

prefix = [1, 0, 0, 0, 0]

Why don't we start the loop from index 0?

Because there is no previous element for index 0.

Build the prefix sum
for(int i = 1; i < nums.length; i++){
    prefix[i] = prefix[i-1] + nums[i];
}

This is the most important line.

It means:

Current prefix sum = Previous prefix sum + Current number

Let's see it step by step.

i = 1
prefix[1] = prefix[0] + nums[1];
= 1 + 2
= 3

Now:

prefix = [1, 3, 0, 0, 0]
i = 2
prefix[2] = prefix[1] + nums[2];
= 3 + 3
= 6
prefix = [1, 3, 6, 0, 0]
i = 3
prefix[3] = 6 + 4 = 10
i = 4
prefix[4] = 10 + 5 = 15

Final:

nums:   [1,  2,  3,  4,  5]
index:   0   1   2   3   4

prefix: [1,  3,  6, 10, 15]
4. Now sumRange()
public int sumRange(int left, int right)

This function gives the sum from left to right.

For example:

sumRange(1, 3)

means:

nums[1] + nums[2] + nums[3]

= 2 + 3 + 4

= 9
5. The special case: left == 0

Your code:

if(left == 0){
    return prefix[right];
}

Suppose:

sumRange(0, 3)

We need:

1 + 2 + 3 + 4 = 10

And:

prefix[3] = 10

So we can directly return:

prefix[right]

No subtraction is needed.

6. The main formula

Otherwise:

return prefix[right] - prefix[left-1];

This is the heart of Prefix Sum.

Let's take:

nums = [1, 2, 3, 4, 5]

Query:

sumRange(1, 3)

We want:

2 + 3 + 4 = 9

Look at prefix:

prefix = [1, 3, 6, 10, 15]

We use:

prefix[right] - prefix[left - 1]

Substitute:

prefix[3] - prefix[0]
10 - 1
= 9
Why does this work?

prefix[3] contains:

1 + 2 + 3 + 4

But we don't want 1.

So subtract:

prefix[0] = 1

Therefore:

(1 + 2 + 3 + 4) - 1

= 2 + 3 + 4

= 9
7. Visual way to remember it

For:

nums = [1, 2, 3, 4, 5]
prefix = [1, 3, 6, 10, 15]
          ↑        ↑
        left-1    right

For:

left = 1
right = 3
prefix[3] - prefix[0]

    10    -    1
          ↓
         9

You're basically saying:

"Give me the sum from the beginning to right, then remove everything before left."
*/

class NumArray{
	private int[] prefix;
	class NumArray(int[]nums){
		prefix[0] = nums[0] ;
		for(int i = 1 ; i<nums.length ; i++){
			prefix[i] = prefix[i-1] + nums[i];
		}
	}
	public int sumRange(int left , int right){
		if(left == 0){
			return prefix[right];
		}
		return prefix[right] - prefix[left-1];
	}
}