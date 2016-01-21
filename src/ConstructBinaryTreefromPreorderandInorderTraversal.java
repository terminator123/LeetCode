package Tree;
/**
 * 
 * @author chenqun
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {

	public TreeNode buildTree(int[] preorder, int[] inorder){
		if(preorder == null && inorder == null || preorder.length == 0) return null;
		TreeNode root = new TreeNode(preorder[0]);
		int i=0;
		for(i=0;i<inorder.length;i++){
			if(inorder[i] == preorder[0])
				break;
		}
		//以i为分界点
		int[] new_inorder_left,new_inorder_right,new_preorder_left,new_preorder_right;
		if(i < inorder.length){
			new_inorder_left = new int[i];
			System.arraycopy(inorder, 0, new_inorder_left, 0, i);
			new_preorder_left = new int[i];
			System.arraycopy(preorder, 1, new_preorder_left, 0, i);
			root.left = buildTree(new_preorder_left,new_inorder_left);
			new_inorder_right = new int[inorder.length-1-i];
			System.arraycopy(inorder, 1+i, new_inorder_right, 0, inorder.length-1-i);
			new_preorder_right = new int[preorder.length-1-i];
			System.arraycopy(preorder, 1+i, new_preorder_right, 0, preorder.length-1-i);
			root.right = buildTree(new_preorder_right,new_inorder_right);
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
