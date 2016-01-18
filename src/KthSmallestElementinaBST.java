package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 */
//中序遍历，存在list中
public class KthSmallestElementinaBST {

	List<Integer> list = new ArrayList<Integer>();
	public int kthSmallest(TreeNode root, int k){
		inorder(root);
		return list.get(k-1);
	}
	public void inorder(TreeNode root){
		if(root == null) return;
		if(root.left != null)
			inorder(root.left);
		list.add(root.val);
		if(root.right != null)
			inorder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
