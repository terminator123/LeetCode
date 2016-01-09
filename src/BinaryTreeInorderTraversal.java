/**
 * 
 * @author chenqun
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 */
//µÝ¹é  ÖÐÐò±éÀú
import java.util.ArrayList;
import java.util.List;
public class BinaryTreeInorderTraversal {
	
	public class  TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
	List<Integer> ans = new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		if( root == null) return ans;
		if(root.left != null) inorderTraversal(root.left);
		ans.add(root.val);
		if(root.right != null) inorderTraversal(root.right);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
