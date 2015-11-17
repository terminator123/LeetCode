/**
 * 
 * @author chenqun
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example   Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Given n will always be valid.
 * Try to do this in one pass.
 *
 */
public class RemoveNthNodeFromEndOfList {
	//双指针
	// 考虑移除的是第一个或者最后一个的情况
	public ListNode removeNthFromEnd(ListNode head,int n)
	{
		if(head == null){
            return head;
        }
		ListNode p = head;
		ListNode q = head;
		
		for(int i=0; i<n; i++){
			p = p.next;
		}

		if(p == null){
            head = head.next;
            return head;
        }
		while(p.next!=null){
			p = p.next;
			q = q.next;
		}
		if(q.next!=null){
			ListNode temp = q.next.next;	
			q.next = temp;
			return head;
		}else{
			q = null;
			return head;
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l = new ListNode(1);
		RemoveNthNodeFromEndOfList test = new RemoveNthNodeFromEndOfList();
		System.out.println(test.removeNthFromEnd(l, 1));
	}

}

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val ){
		this.val = val;
	}
	
}