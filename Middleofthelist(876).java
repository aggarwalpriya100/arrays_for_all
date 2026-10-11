/*
 // 2 pointer technique 
			876 : Middle of the Linked List 
			Problem: Middle of the Linked List
Given the head of a singly linked list, return the middle node.
If there are two middle nodes, return the second middle node.
Example 1
Input
1

2

3

4

5


Output
Node with value 3

Example 2
Input: 1 → 2 → 3 → 4 → 5 → 6
Output: Node with value 4
There are two middle nodes, 3 and 4, so we return the second one.
			
*/

class Solution{
	public ListNode middleNode(ListNode head){
		ListNode slow = head ;
		ListNode fast = head ;
		while(fast != null && fast.next != null){
			slow =slow.next;
			fast =fast.next.next;
		}
		return slow ;
	}
}
