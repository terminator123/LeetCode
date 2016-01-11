package ListNode;
/**
 * 
 * @author chenqun
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 */
public class PartitionList {

	public ListNode partition(ListNode head, int x){
		if(head == null || head.next == null)	return head;
		ListNode firsthead = new ListNode(0);
		ListNode secondhead = new ListNode(0);
		ListNode first = firsthead;
		ListNode second = secondhead;
		ListNode cur = head;
		while(cur != null ){
			ListNode tmp = cur;
			cur = cur.next;
			if(tmp.val < x){
				first.next = tmp;
				first = first.next;
			}else{
				second.next = tmp;
				second = second.next;
				second.next = null;
			}
		}
		first.next = secondhead.next;
		return firsthead.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		a.next = b;
		b.next = null;
		PartitionList  test = new  PartitionList();
		System.out.println(test.partition(a, 0).next.val);
	}

}
