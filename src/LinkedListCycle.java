package ListNode;
/**
 * 
 * @author chenqun
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:Can you solve it without using extra space?
 */
//快慢指针，快指针走两圈与慢指针相遇
public class LinkedListCycle {

	public boolean hasCycle(ListNode head){
		if(head == null) return false;
		ListNode fast = head.next;
		ListNode slow = head;
		while( fast != slow){
			if(fast == null || fast.next == null) return false;
			fast = fast.next.next;
			slow = slow.next;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
