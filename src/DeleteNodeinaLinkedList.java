package ListNode;
/**
 * 
 * @author chenqun
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 */
//�Ѻ���ڵ��ֵ������ǰֵ����ɾ������Ľڵ�
public class DeleteNodeinaLinkedList {

	public void deleteNode(ListNode node){
		if(node.next != null){
			node.val = node.next.val;
			node.next = node.next.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
