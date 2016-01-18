package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Given a complete binary tree, count the number of nodes.
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. 
 * It can have between 1 and 2h nodes inclusive at the last level h.
 */
public class CountCompleteTreeNode {

	public int countNodes(TreeNode root){
		
		if(root == null) return 0;
		int leftHeight = 1;
		int rightHeight = 1;
		TreeNode p = root.left;
		while(p != null){
			leftHeight ++;
			p = p.left;
		}
		p = root.right;
		while(p != null){
			rightHeight ++;
			p = p.right;
		}
		System.out.println(leftHeight + " " + rightHeight);
		if(leftHeight == rightHeight)
			return (1<<leftHeight)-1;
		return countNodes(root.left) + countNodes(root.right) + 1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(4);
		TreeNode d = new TreeNode(5);
		TreeNode e = new TreeNode(6);
		root.left = a;
		root.right = b;
		a.left = c;
		a.right = d;
		b.left = e;
		CountCompleteTreeNode test = new CountCompleteTreeNode();
		System.out.println(test.countNodes(root));
	}

}
