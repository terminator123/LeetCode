/**
 * 
 * @author chenqun
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * For example:Given 1->2->3->4->5->NULL and k = 2,return 4->5->1->2->3->NULL.
 *
 */
//�����k�����Ǳ�������Ҫ������֣����ʵ����ת��λ�þ���k%len(list)����������������������ߵ���len(list)���б��ǲ�����ת�ġ�
//����ָ�룬��ָ��ǰ��k%len��
public class RotateList {

	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x;}
	}
	public ListNode rotateRight(ListNode head, int k){
		if(head == null || head.next == null ) return head;
		//�õ�ָ�볤��
		ListNode tmp = head;
		int length = 1;
		while(tmp.next != null){
			length ++;
			tmp = tmp.next;
		}
		k = k % length;
		if(k  == 0) return head;
		ListNode fast = head;
		int count = 0;
		while(count < k){
			fast = fast.next;
			count ++ ;
		}
		ListNode slow = head;
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		ListNode ans = slow.next;
		slow.next = null;
		fast.next = head;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
