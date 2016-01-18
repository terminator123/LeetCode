package Tree;
/**
 * @author chenqun
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * 
 */
//对于二叉搜索树，如果两个数都小于根节点，则两个数在左节点上比，反之，在右节点，如果一个大于根节点，一个小于根节点，则公共父节点是根节点
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
