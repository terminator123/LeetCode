package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 */
//นใหั
public class BinaryTreeLevelOrderTraversal {

	
	public List<List<Integer>>	levelOrder(TreeNode root){
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		LinkedList<TreeNode> curLevel = new LinkedList<TreeNode>();
		if(root != null)
			curLevel.add(root);
		while(!curLevel.isEmpty()){
			LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
			List<Integer> list = new ArrayList<Integer>();
			for(TreeNode node:curLevel){
				list.add(node.val);
				if(node.left != null)
					nextLevel.add(node.left);
				if(node.right != null)
					nextLevel.add(node.right);
			}
			ans.add(list);
			curLevel = nextLevel;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
