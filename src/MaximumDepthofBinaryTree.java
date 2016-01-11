package ListNode;

import java.util.LinkedList;

/**
 * 
 * @author chenqun
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 */
//广搜 得到深度
public class MaximumDepthofBinaryTree {

	public int maxDepth(TreeNode root){
		if(root == null) return 0;
		LinkedList<TreeNode> currentLevel = new LinkedList<TreeNode>();
		if(root != null )
			currentLevel.add(root);
		int level = 1;
		while(currentLevel != null){
			LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
			for(TreeNode node : currentLevel){
				if(node.left != null)
					nextLevel.add(node.left);
				if(node.right != null)
					nextLevel.add(node.right);
			}
			level ++;
			currentLevel = nextLevel;
		}
		return level;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
