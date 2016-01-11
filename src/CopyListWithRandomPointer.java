package ListNode;
/**
 * 
 * @author chenqun
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 */
public class CopyListWithRandomPointer {

	class RandomListNode{
		int label;
		RandomListNode next,random;
		RandomListNode(int x){ this.label = x;}
	}
	public RandomListNode copyRandomList(RandomListNode head){
		if(head == null) return head;
		//在每个节点后面插入一个copy节点 
		RandomListNode curNode = head;
		while(curNode != null){
			RandomListNode copyNode = new RandomListNode(curNode.label);
			copyNode.random = curNode.random;
			copyNode.next = curNode.next;
			curNode.next = copyNode;
			curNode = curNode.next.next;
		}
		//把copynode的random节点更新
		curNode = head;
		while(curNode != null){
			if(curNode.random != null){
				curNode.next.random = curNode.random.next;
			}
			curNode = curNode.next.next;
		}
		//还原oldlist的next为它一开始的next节点  拼接copylist的next节点
		RandomListNode phead = new RandomListNode(0);
		phead.next = head;
		RandomListNode newList = phead;
		curNode = head;
		while(curNode != null){
			phead.next = curNode.next;
			curNode.next = curNode.next.next;
			phead = phead.next;
			curNode = curNode.next;
		}
		return newList.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
