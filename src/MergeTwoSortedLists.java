/**
 * 
 * @author chenqun
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 */
//使用dummynode虚节点记录头节点的前一个
public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		
		ListNode head = new ListNode(0);
		ListNode cur = head; ;
		while(l1!=null && l2!=null){
			if(l1.val < l2.val){
				cur.next = l1;
				l1 = l1.next;
			}else{
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		if(l1!=null)
			cur.next = l1;
		else
			cur.next = l2;
		return head.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
