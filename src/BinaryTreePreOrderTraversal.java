import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 */
//����ǰ����� �ݹ�
public class BinaryTreePreOrderTraversal {

	public class  TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	List<Integer> ans = new ArrayList<Integer>();
	//ǰ�����
	public List<Integer> preorderTraversal(TreeNode root){
		
		if( root == null) return ans;
		ans.add(root.val);
		if(root.left != null) preorderTraversal(root.left);
		if(root.right != null) preorderTraversal(root.right);
		return ans;
	}
	//�������
	public List<Integer> inorderTraversal(TreeNode root){
		
		if( root == null) return ans;
		if(root.left != null) inorderTraversal(root.left);
		ans.add(root.val);
		if(root.right != null) inorderTraversal(root.right);
		return ans;
	}
	//�������
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
