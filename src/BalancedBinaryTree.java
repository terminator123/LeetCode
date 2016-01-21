package Tree;
/**
 * 
 * @author chenqun
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 */
public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode root){
		if(root == null) return true;
		if(root.left == null && root.right == null) return true;
		int depth = depth(root);
		if(depth == -1) return false;
		else 
			return true;
	}
	public int depth(TreeNode root){
		if(root == null) return 0;
		int left = depth(root.left);
		int right = depth(root.right);
		if(left == -1 || right == -1 || Math.abs(left-right)>1) return -1;
		return Math.max(left, right)+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
