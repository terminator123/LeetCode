package ListNode;
/**
 * 
 * @author chenqun
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class ConvertSortedListtoBinarySearchTree {

	public TreeNode sortedListToBST(ListNode head){
		if(head == null)
			return null;
		if(head.next == null)
			return new TreeNode(head.val);
		ListNode pslow,pfast;
		pslow = head;
		pfast = head.next.next;
		while(pfast !=null && pfast.next != null ){
			pslow = pslow.next;
			pfast = pfast.next.next;
		}
		TreeNode root = new TreeNode(pslow.next.val);
		root.right = sortedListToBST(pslow.next.next);
		pslow.next = null;
		root.left = sortedListToBST(head);
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
