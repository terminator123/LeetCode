package Tree;
/**
 * 
 * @author chenqun
 *
 */
//There're 3 possibilities in this problem: 1) only left branch 2) only right branch 3) cross the root. 
//The basic idea is to get maximum value in left branch and right branch, then plus the current node's value. 
//After comparing, keep the maximum one. As the following:
//max1 is the max value of the current node to pass to the upper level node.
//max is the global max value that could be max1 or the sum of root and left max and right max
public class BinaryTreeMaximumPath {

	int max = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root){
		maxBranch(root);
		return max;
	}
	public int maxBranch(TreeNode root){
		if(root == null) return 0;
		int left = Math.max(maxBranch(root.left), 0);
		int right = Math.max(maxBranch(root.right), 0);
		int max1 = Math.max(root.val,Math.max(root.val+left,root.val+right));
		max = Math.max(max,Math.max(max1,left+right+root.val));
		return max1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
