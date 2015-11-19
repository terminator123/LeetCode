/**
 * 
 * @author chenqun
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 *
 */
public class SwapNodesInParis {

	public ListNode swapPairs(ListNode head){
		ListNode ret = new ListNode(0);
		ListNode p = ret;
		while(head!=null && head.next!=null){
			p.next = head.next;
			head.next = head.next.next;
			p.next.next = head;
			p = p.next.next;
			head = head.next;
		}
		if(head!=null)
			p.next = head;
		return ret.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		SwapNodesInParis test = new SwapNodesInParis();
		System.out.println(test.swapPairs(l1).val);
	}

}
