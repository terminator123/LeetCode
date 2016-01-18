package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ListNode.TreeNode;

/**
 * 
 * @author dell
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * For example,Given n = 3, your program should return all 5 unique BST's shown below.
 *
 */
//递归产生 1-n的tree
public class UniqueBinarySearchTreesII {
	 public List<TreeNode> generateTrees(int n) {
	      if(n == 0)
	    	  return new ArrayList<TreeNode>();
	      return generateTrees(1,n);
	  }
	 public List<TreeNode> generateTrees(int start, int end){
		 List<TreeNode> result = new ArrayList<TreeNode>();
		 if(start > end){
			 result.add(null);
			 return result;
		 }
		 for(int i=start; i<=end; i++){ //分别以i为跟节点
			 List<TreeNode> left = generateTrees(start,i-1);
			 List<TreeNode> right = generateTrees(i+1,end);
			 for(TreeNode node1:left){
				 for(TreeNode node2:right){
					 TreeNode root = new TreeNode(i);
					 root.left = node1;
					 root.right = node2;
					 result.add(root);
					 
				 }
			 }
		 }
		 return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
