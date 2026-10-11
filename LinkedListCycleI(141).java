/*
1. LeetCode 141 — Linked List Cycle
Question: Given the head of a linked list, determine if the linked list has a cycle in it.
A cycle exists if some node in the list can be reached again by continuously following the next pointer. Internally, pos is used to indicate the index of the node that the tail connects to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
Example 1:
Input
head = [3,2,0,-4], pos = 1
Output
true
Explanation: The tail connects to the node at index 1 (value 2), creating a cycle.

Example 2:
- Input: head = [1,2], pos = 0
- Output: true
Example 3:
- Input: head = [1], pos = -1
- Output: false
*/

public class Solution{
	public boolean hasCycle(ListNode head){
		ListNode slow = head ;
		ListNode fast = head ;
		while(fast!= null && fast.next !=null){
			slow = slow.next;
			fast = fast.next.next;
			
			// it helps to detect cycle 
			if(slow == fast){
				return true ;
			}
		} 
		return false ;
	}
}