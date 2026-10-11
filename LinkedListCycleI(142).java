/*
LeetCode 142 — Linked List Cycle II
Question: Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
Do not modify the linked list.
Example 1:
Input
head = [3,2,0,-4], pos = 1
Output
tail connects to node index 1
Explanation: The cycle starts at the node whose value is 2. Return that node, not its value alone.

Example 2:
- Input: head = [1,2], pos = 0
- Output: tail connects to node index 0
Example 3:
- Input: head = [1], pos = -1
- Output: null
*/

class Solution {
	public ListNode detectCycle(ListNode head){
		ListNode slow = head ;
		ListNode fast = head ;
		while(fast != null &&  fast.next != null ){
			slow = slow.next ;
			fast = fast.next.next ;
			
			if(slow == fast){
				// cycle starts 
				slow = head ;
				
				while(slow != fast){
					slow = slow.next;
					fast =fast.next;
				}
				return slow ;
			}
		}
		return null ;
	}
}