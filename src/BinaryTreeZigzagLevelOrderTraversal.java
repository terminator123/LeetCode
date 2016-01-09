import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. 
 * (ie, from left to right, then right to left for the next level and alternate between).
 * For example:Given binary tree {3,9,20,#,#,15,7},
 */
//按层遍历二叉树（BFS），然后根据层数来判断是不是要翻转
//递归版，时间复杂度O(n)，空间复杂度O(n)

public class BinaryTreeZigzagLevelOrderTraversal {

	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root){
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		//BFS
		LinkedList<TreeNode> currentLevel = new LinkedList<TreeNode>();
		if(root != null)
			currentLevel.add(root);
		int level = 1;
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
			if(level % 2 == 0)
				Collections.reverse(list);
			ans.add(list);
			currentLevel = nextLevel;
			level ++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
