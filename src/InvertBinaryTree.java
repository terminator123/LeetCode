package Tree;
/**
 * 
 * @author chenqun
 * Invert a binary tree.
 *
 */
public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root){
		if(root == null) return root;
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}
