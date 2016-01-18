package Tree;

import java.util.ArrayList;
import java.util.List;

import ListNode.TreeNode;

/**
 * 
 * @author chenqun
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:The left subtree of a node contains only nodes with keys less than the node's key.The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 */
//中序遍历，看结果是不是升序
public class ValidateBinarySearchTree {

	List<Integer> ans = new ArrayList<Integer>();
	public boolean isValidBST(TreeNode root){
		inorderTraversal(root);
		for(int i=1; i<ans.size(); i++){
			if(ans.get(i) <= ans.get(i-1))
				return false;
		}
		return true;
	}
	public void inorderTraversal(TreeNode root){
		if(root == null) return ;
		if(root.left != null)
			inorderTraversal(root.left);
		ans.add(root.val);
		if(root.right != null)
			inorderTraversal(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
