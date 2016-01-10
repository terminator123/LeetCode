package ListNode;
/**
 * 
 * @author chenqun
 * Remove all elements from a linked list of integers that have value val.
 * Example Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6 Return: 1 --> 2 --> 3 --> 4 --> 5
 */
//Ë«Ö¸Õë
public class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head,int val){
		if(head == null) return head;
		ListNode start = new ListNode(0);
		ListNode pre = start;
		start.next = head;
		ListNode current = head;
		while(current != null){
			if(current.val == val){
				pre.next = current.next;
			}else
				pre = pre.next;
			current = current.next;
		}
		return start.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveLinkedListElements test = new RemoveLinkedListElements();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		a.next = b;
		b.next = null;
		System.out.println(test.removeElements(a, 1).val);
	}

}
