package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author chenqun
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 */
public class BinaryTreeLevelOrderTraversalII {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		//BFS
		LinkedList<TreeNode> currentLevel = new LinkedList<TreeNode>();
		if(root != null)
			currentLevel.add(root);
		while(!currentLevel.isEmpty()){
			LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
			List<Integer> list = new ArrayList<Integer>();
			for(TreeNode node:currentLevel){
				list.add(node.val);
				if(node.left != null)
					nextLevel.add(node.left);
				if(node.right != null)
					nextLevel.add(node.right);
			}
			ans.add(list);
			currentLevel = nextLevel;
		}
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		for(int i=ans.size()-1; i>=0;i--){
			List<Integer> list = new ArrayList<Integer>();
			list = ans.get(i);
			ret.add(list);
		}
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
