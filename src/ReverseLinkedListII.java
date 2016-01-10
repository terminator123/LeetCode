package ListNode;
/**
 * 
 * @author chenqun
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * For example:Given 1->2->3->4->5->NULL, m = 2 and n = 4,return 1->4->3->2->5->NULL.
 *
 */
public class ReverseLinkedListII {
	
	public ListNode reverseBetween(ListNode head, int m, int n){
		if(head.next == null) return head;
		ListNode pre = new ListNode(0);
		pre.next = head;
		int k = n-m;
		ListNode fast = pre;
		ListNode slow = pre;
		int count = 0;
		while(count < k){
			fast = fast.next;
			count ++;
		}
		while(count < n-1){
			fast = fast.next;
			slow = slow.next;
			count ++;
		}
		ListNode tmp = fast.next.next;
		fast.next.next = null;
		slow.next = reverseList(slow.next);
		while(slow.next != null){
			slow = slow.next;
		}
		slow.next = tmp;
		return pre.next;
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
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(5);
		a.next = b;
		b.next = null;
		ReverseLinkedListII  test = new ReverseLinkedListII();
		System.out.println(test.reverseBetween(a,1,2).next.val);
	}

}
