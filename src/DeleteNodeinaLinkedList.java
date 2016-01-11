package ListNode;
/**
 * 
 * @author chenqun
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 */
//把后面节点的值赋给当前值，再删除后面的节点
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
