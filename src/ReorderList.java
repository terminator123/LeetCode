package ListNode;
/**
 * 
 * @author chenqun
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * You must do this in-place without altering the nodes' values.
 * For example,Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 */
public class ReorderList {

	public void reorderList(ListNode head){
		if(head == null || head.next == null) return;
		ListNode pre = new ListNode(0);
		ListNode fast = head;
		ListNode slow = head;
		pre.next = slow;
		ListNode start = head;
		//快慢指针找到中间节点
		while(fast!= null && fast.next != null ){
			slow = slow.next;
			pre = pre.next;
			fast = fast.next.next;
		}
		pre.next = null;
		slow = reverseList(slow);
		//merge
		while(start.next != null){
			ListNode tmp = start.next;
			start.next = slow;
			slow = slow.next;
			start.next.next = tmp;
			start = start.next.next;
		}
		start.next = slow;
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
