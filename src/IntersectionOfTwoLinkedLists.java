package ListNode;
/**
 * 
 * @author chenqun
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 */
//链表无环，分别求出两个链表长度，m,n,让一个链表先走m-n不走，再同时移步，看有没有相等的
public class IntersectionOfTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
		if( headA == null || headB == null) return null;
		int lengthA = 0;
		int lengthB = 0;
		ListNode tmp = headA;
		ListNode fast;
		ListNode slow;
		while(tmp != null){
			lengthA ++;
			tmp = tmp.next;
		}
		tmp = headB;
		while(tmp != null){
			lengthB ++;
			tmp = tmp.next;
		}
		if(lengthA > lengthB){
			int k = lengthA - lengthB;
			int count = 0;
			fast = headA;
			slow = headB;
			while(count < k){
				fast = fast.next;
				count ++;
			}
			while(fast != slow){
				fast = fast.next;
				slow = slow.next;
			}
		}else{
			int k = lengthB - lengthA;
			int count = 0;
			fast = headB;
			slow = headA;
			while(count < k){
				fast = fast.next;
				count ++;
			}
			while(fast != slow){
				fast = fast.next;
				slow = slow.next;
			}
		}
		return slow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		a.next = b;
		b.next = null;
		IntersectionOfTwoLinkedLists test = new IntersectionOfTwoLinkedLists();
		System.out.println(test.getIntersectionNode(a, b).val);
	}

}
