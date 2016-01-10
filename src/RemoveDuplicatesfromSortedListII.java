package ListNode;
/**
 * 
 * @author chenqun
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * For example,Given 1->2->3->3->4->4->5, return 1->2->5.Given 1->1->1->2->3, return 2->3.
 *
 */
public class RemoveDuplicatesfromSortedListII {

	public ListNode deleteDuplicates(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode start = new ListNode(0);
		start.next = head;
		ListNode cur = head;
		ListNode tmp = start;
		while(cur != null && cur.next != null){
			if(cur.val == cur.next.val){
				while(cur.next != null && cur.val == cur.next.val ){
					cur = cur.next;
				}
			}else {
				tmp.next = cur;
				tmp = tmp.next;
			}
			cur = cur.next;
		}
		tmp.next = cur;
		return start.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		a.next = b;
		b.next = null;
		RemoveDuplicatesfromSortedListII test = new  RemoveDuplicatesfromSortedListII();
		System.out.println(test.deleteDuplicates(a).next.val);
	}

}
