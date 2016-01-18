package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * Recover the tree without changing its structure.
 */
//��������������쳣�������ڵ㣬ע�� ���ڵ�Ϊ2����ڵ�Ϊ3���нڵ�Ϊ2�����
public class RecoverBinarySearchTree {

	public void recoverTree(TreeNode root){
		inorderTraversal(root);
		TreeNode first = null,second = null;
		for(int i=0; i<ans.size()-1; i++){
			if(ans.get(i).val > ans.get(i+1).val){
				if(first == null)
					first = ans.get(i);
				second = ans.get(i+1);
			}
		}
		int tmp = first.val;
		first.val = second.val;
		second.val = tmp;
	}
	List<TreeNode> ans = new ArrayList<TreeNode>();
	public void inorderTraversal(TreeNode root) {
		if( root == null) return;
		if(root.left != null) inorderTraversal(root.left);
		ans.add(root);
		if(root.right != null) inorderTraversal(root.right);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
