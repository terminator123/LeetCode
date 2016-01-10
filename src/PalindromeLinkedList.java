package ListNode;
/**
 * 
 * @author chenqun
 * Given a singly linked list, determine if it is a palindrome.
 *
 */
public class PalindromeLinkedList {
	
	public boolean isPalindrome(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		//快慢指针找到中间节点
		while(fast!= null && fast.next != null ){
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = reverseList(slow);
		while(slow != null){
			if(slow.val == head.val){
				slow = slow.next;
				head = head.next;
			}else 
				return false;
		}
		return true;
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

	}

}
