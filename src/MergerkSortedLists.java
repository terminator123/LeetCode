/**
 * @author chenqun
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * k lists,each list has n elements,the complexity is O(knlogk)
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergerkSortedLists {

	 public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0)
			return null;
		ListNode head = new ListNode(0);
		ListNode p = head;
		//自己实现comrarator
		Comparator<ListNode> order = new Comparator<ListNode>(){
			public int compare(ListNode a, ListNode b){
				if(a.val > b.val)
					return 1;
				else if(a.val == b.val)
					return 0;
				else 
					return -1;
			}
		};
		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.length, order);
		for(ListNode list : lists){
			if(list!=null)
				q.add(list);
		}
		while(q.size() > 0){
			ListNode temp = q.poll(); 
			p.next = temp; //每次把最小的加进去
			if(temp.next !=null)
				q.add(temp.next);
			p = p.next;
		}
		return head.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode[] lists = {l1,l2};
		MergerkSortedLists  test = new MergerkSortedLists ();
		System.out.println(test.mergeKLists(lists));
	}

}
