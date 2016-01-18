package Tree;

import ListNode.TreeNode;

/**
 * 
 * @author chenqun
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 */
public class SymmetricTree {

	public boolean isSymmetric(TreeNode root){
		if(root == null)
			return true;
		else 
			return isSymmetricTwoTree(root.left, root.right);
	}
	//判断两棵树是不是对称的
	public boolean isSymmetricTwoTree(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null)
			return true;
		if(t1 == null || t2 == null)
			return false;
		if(t1.val != t2.val){
			return false;
		}
		return isSymmetricTwoTree(t1.left,t2.right) && isSymmetricTwoTree(t1.right , t2.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
