/**
 * 
 * @author chenqun
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 */
import java.util.ArrayList;
import java.util.List;
public class BinaryTreePostorderTraversal {

	public class  TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root){
		
		if( root == null) return ans;
		if(root.left != null) postorderTraversal(root.left);
		if(root.right != null) postorderTraversal(root.right);
		ans.add(root.val);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
