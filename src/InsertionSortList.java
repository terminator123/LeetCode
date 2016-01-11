package ListNode;
/**
 * 
 * @author chenqun
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {

	public ListNode insertionSortList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode start = new ListNode(-1);
		start.next = head;
		ListNode cur = head.next;
		head.next = null;
		while(cur != null){
			ListNode tmp = cur;
			cur = cur.next;
			tmp.next = null;
			start = Insert(start,tmp);
		}
		return start.next;
	}
	public ListNode Insert(ListNode start, ListNode tmp){
		ListNode cur = start;
		while(cur.next != null){
			if(cur.next.val > tmp.val){
				tmp.next = cur.next;
				cur.next = tmp;
				break;
			}
			cur = cur.next;
		}
		if(cur.next == null)
			cur.next = tmp;
		return start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		a.next = b;
		b.next = null;
		InsertionSortList test = new InsertionSortList();
		System.out.println(test.insertionSortList(a).val);
	}

}
