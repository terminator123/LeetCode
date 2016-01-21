package Tree;
/**
 * 
 * @author chenqun
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 *
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {

	public TreeNode buildTree(int[] inorder, int[] postorder){
		if(inorder == null && postorder == null || inorder.length == 0)
			return null;
		TreeNode root = new TreeNode(postorder[postorder.length-1]);
		int i=0;
		for(i=0; i<inorder.length; i++){
			if(inorder[i] == postorder[postorder.length-1])
				break;
		}
		//以i为分界点
		int[] new_inorder_left,new_inorder_right,new_postorder_left,new_postorder_right;
		if(i < inorder.length){
			new_inorder_left = new int[i];
			System.arraycopy(inorder, 0, new_inorder_left, 0, i);
			new_postorder_left = new int[i];
			System.arraycopy(postorder, 0, new_postorder_left, 0, i);
			root.left = buildTree(new_inorder_left,new_postorder_left);
			new_inorder_right = new int[inorder.length-1-i];
			System.arraycopy(inorder, 1+i, new_inorder_right, 0, inorder.length-1-i);
			new_postorder_right = new int[postorder.length-1-i];
			System.arraycopy(postorder, i, new_postorder_right, 0, postorder.length-1-i);
			root.right = buildTree(new_inorder_right,new_postorder_right);
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
