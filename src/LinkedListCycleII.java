package ListNode;
/**
 * 
 * @author chequn
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * Note: Do not modify the linked list.
 */
public class LinkedListCycleII {

	public ListNode detectCycle(ListNode head){
		if(head == null) return head;
		ListNode fast = head.next;
		ListNode slow = head;
		while( fast != slow){
			if(fast == null || fast.next == null) return null;
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode tmp = new ListNode(0);
		tmp.next = head;
		while(tmp != slow){
			tmp = tmp.next;
			slow = slow.next;
		}
		return tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		b.next = a;
		LinkedListCycleII test = new LinkedListCycleII();
		System.out.println(test.detectCycle(a).val);
	}

}
