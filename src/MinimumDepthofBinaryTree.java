package Tree;

import java.util.LinkedList;

/**
 * 
 * @author chenqun
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthofBinaryTree {

	public int minDepth(TreeNode root){
		if(root == null) return 0;
		LinkedList<TreeNode> curLevel = new LinkedList<TreeNode>();
		curLevel.add(root);
		int level = 0;
		while(! curLevel.isEmpty()){
			level ++;
			LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
			for(TreeNode node : curLevel){
				if(node.left == null && node.right == null)
					return level;
				if(node.left != null)
					nextLevel.add(node.left);
				if(node.right != null)
					nextLevel.add(node.right);
			}
			curLevel = nextLevel;
		}
		return level;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
