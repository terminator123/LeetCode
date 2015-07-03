/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);;
        ListNode head = ret;
     	int carry = 0;
         while(l1 != null && l2 != null){
        	int tmp = l1.val + l2.val + carry;
        	l1 = l1.next;
        	l2 = l2.next;
        	ret.next = new ListNode( tmp % 10);
        	if(tmp >= 10)
        		carry = 1;
        	else 
        		carry = 0;
        	ret = ret.next;
        }
        if(l1 != null){
        	while(l1 != null){
        		int tmp = l1.val + carry;
        		l1  = l1.next;
        		ret.next = new ListNode( tmp % 10);
            	if(tmp >= 10)
            		carry = 1;
            	else 
            		carry = 0;
            	ret = ret.next;
        	}
        	if(carry > 0)
        		ret.next = new ListNode(carry);
        
        }else if(l2 != null){
        	while(l2 != null){
        		int tmp = l2.val + carry;
        		l2 = l2.next;
        		ret.next = new ListNode( tmp % 10);
            	if(tmp >= 10)
            		carry = 1;
            	else 
            		carry = 0;
            	ret = ret.next;
        	}
        	if(carry > 0)
        		ret.next = new ListNode(carry);
        }else {
        	if(carry > 0)
        		ret.next = new ListNode(carry);
        	
        }
        return head.next;
    }
    public static void main(String[] args){
    	ListNode l1 = new ListNode(0);
    	ListNode l2  = new ListNode(0);
    	ListNode ret = addTwoNumbers(l1,l2);
    	System.out.print(ret.val);
    	
    }
}
class ListNode{
	int val;
	ListNode next;
	public ListNode(int val ){
		this.val = val;
	}
	
}
