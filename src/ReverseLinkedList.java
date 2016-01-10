/**
 * 
 * @author chenqun
 * Reverse a singly linked list.
 *
 */
public class ReverseLinkedList {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x;}
	}
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode pre = null;
		ListNode current = head;
		ListNode next = null;
		while(current != null){
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}
		return pre;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

