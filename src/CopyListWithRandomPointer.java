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
		//��ÿ���ڵ�������һ��copy�ڵ� 
		RandomListNode curNode = head;
		while(curNode != null){
			RandomListNode copyNode = new RandomListNode(curNode.label);
			copyNode.random = curNode.random;
			copyNode.next = curNode.next;
			curNode.next = copyNode;
			curNode = curNode.next.next;
		}
		//��copynode��random�ڵ����
		curNode = head;
		while(curNode != null){
			if(curNode.random != null){
				curNode.next.random = curNode.random.next;
			}
			curNode = curNode.next.next;
		}
		//��ԭoldlist��nextΪ��һ��ʼ��next�ڵ�  ƴ��copylist��next�ڵ�
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
