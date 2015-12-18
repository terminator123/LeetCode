/**
 * 
 * @author chenqun
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 *
 */
public class SortList {

	public ListNode sortList(ListNode head){
		if(head == null || head.next == null)
			return head;
		//利用快慢指针找到中间节点
		ListNode plow,pfast;
		plow = head;
		pfast = head.next;
		while(pfast.next !=null && pfast.next.next !=null){
			plow = plow.next;
			pfast = pfast.next.next;
		}
		//plow是第二部分的第一个节点，然后开始递归
		pfast = sortList(plow.next);
		plow.next = null;
		plow  = sortList(head);
		return merge(plow,pfast);
	}
	
	//合并两个有序的list
	ListNode merge(ListNode pa,ListNode pb){
		if(pa == null && pb == null)
			return null;
		ListNode tmp = new ListNode(0);
		ListNode pc = tmp;
		while(pa!=null && pb!=null){
			if(pa.val < pb.val){
				pc.next = pa;
				pc = pc.next;
				pa = pa.next;
			}else{
				pc.next = pb;
				pc = pc.next;
				pb = pb.next;
			}
		}
		if(pa!=null)
			pc.next = pa;
		if(pb!=null)
			pc.next = pb;
		return tmp.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
