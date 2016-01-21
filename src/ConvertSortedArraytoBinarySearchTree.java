package Tree;
/**
 * 
 * @author chenqun
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 */
public class ConvertSortedArraytoBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums){
		if(nums == null || nums.length == 0) return null;
		return constructBST(nums,0,nums.length-1);
		
	}
	public TreeNode  constructBST(int[] nums,int start, int end){
		if(start > end) return null;
		if(start == end) return new TreeNode(nums[start]);
		int mid = start + (end - start)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = constructBST(nums,start,mid-1);
		root.right = constructBST(nums,mid+1,end);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
