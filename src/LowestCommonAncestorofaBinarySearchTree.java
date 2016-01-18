package Tree;
/**
 * @author chenqun
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * 
 */
//���ڶ����������������������С�ڸ��ڵ㣬������������ڵ��ϱȣ���֮�����ҽڵ㣬���һ�����ڸ��ڵ㣬һ��С�ڸ��ڵ㣬�򹫹����ڵ��Ǹ��ڵ�
import java.util.Stack;
import ListNode.TreeNode;

public class LowestCommonAncestorofaBinarySearchTree {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(p.val <= root.val && q.val >= root.val)
			return root;
		if(p.val >= root.val && q.val <= root.val)
			return root;
		if(p.val < root.val && q.val < root.val)
			return lowestCommonAncestor(root.left,p,q);
		else if(p.val > root.val && q.val > root.val)
			return lowestCommonAncestor(root.right,p,q);
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
