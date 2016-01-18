package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Given a binary tree, flatten it to a linked list in-place.
 */
//ษ๎หั
public class FlattenBinaryTreetoLinkedList {
	List<TreeNode> list = new ArrayList<TreeNode>();
	public void flatten(TreeNode root){
		if(root == null) return ;
		if(root.left == null && root.right == null) return;
		dfs(root);
		root.left = null;
		root.right = list.get(1);
		for(int i=1; i<list.size()-1;i++){
			list.get(i).left = null;
			list.get(i).right = list.get(i+1);
		}
		list.get(list.size()-1).left = null;
		list.get(list.size()-1).right = null;
		root = list.get(0);
	}
	public void dfs(TreeNode root){
		list.add(new TreeNode(root.val));
		if(root.left == null && root.right == null){
				return;
		}
		if(root.left != null){
			dfs(root.left);
		}
		if(root.right != null){
			dfs(root.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		root.left = left;
		FlattenBinaryTreetoLinkedList test = new FlattenBinaryTreetoLinkedList();
		test.flatten(root);
		System.out.println(SerializeandDeserializeBinaryTree.serialize(root));
	}

}
