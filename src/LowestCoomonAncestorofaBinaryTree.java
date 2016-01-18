package Tree;

import ListNode.TreeNode;

/**
 * 
 * @author chenqun
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia: ¡°The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as 
 * descendants (where we allow a node to be a descendant of itself).¡±
 *
 */
//µÝ¹é
public class LowestCoomonAncestorofaBinaryTree {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(root == p || root == q || root == null) 
			return root;
		TreeNode left = lowestCommonAncestor(root.left,p,q);
		TreeNode right = lowestCommonAncestor(root.right,p,q);
		if(left != null && right != null)
			return root;
		return left!=null?left:right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
