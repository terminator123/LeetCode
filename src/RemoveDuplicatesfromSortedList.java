/**
 * 
 * @author chenqun
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,Given 1->1->2, return 1->2.Given 1->1->2->3->3, return 1->2->3.
 *
 */
public class RemoveDuplicatesfromSortedList {

	public ListNode deleteDuplicates(ListNode head){
		 ListNode pre = head;
			if(pre == null || pre.next == null)
				return head;
			while(pre.next != null){
				if(pre.val == pre.next.val)
				{
					pre.next = pre.next.next;
				}else
					pre = pre.next;
			}
			return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(1);
		l1.next = l2;
		l2.next = l3;
		RemoveDuplicatesfromSortedList test = new RemoveDuplicatesfromSortedList();
		test.deleteDuplicates(l1);
	}

}
