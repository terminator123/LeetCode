package Tree;
/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SerializeandDeserializeBinaryTree {

	public static String serialize(TreeNode root){
		LinkedList<TreeNode> curLevel = new LinkedList<TreeNode>();
		Stack<Integer> stack = new Stack<Integer>();
		if(root == null) return null;
		stack.push(root.val);
		curLevel.add(root);
		while(!curLevel.isEmpty()){
			LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
			for(TreeNode node : curLevel){
				if(node.left != null){
					nextLevel.add(node.left);
					stack.push(node.left.val);
				}else{
					stack.push(null);
				}
				if(node.right != null){
					nextLevel.add(node.right);
					stack.push(node.right.val);
				}else{
					stack.push(null);
				}
			}
			curLevel = nextLevel;
		}
		while(stack.peek() == null){
			stack.pop();
		}
		String ans = stack.toString().replace(" ", "");
		return ans;
	}
	public TreeNode deserialize(String data){
		if(data == null)  return null;
		LinkedList<TreeNode> curLevel = new LinkedList<TreeNode>();
		data = data.substring(1, data.length()-1);
		System.out.println(data);
		String[] str = data.split(",");
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0; i<str.length; i++){
			if(str[i].equals("null"))
				queue.offer(null);
			else queue.offer(Integer.valueOf(str[i]));
		}
		TreeNode root  = new TreeNode(queue.poll());
		curLevel.add(root);
		while(!curLevel.isEmpty()){
			LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
			for(TreeNode node : curLevel){
				if(queue.peek()!= null){
					TreeNode left = new TreeNode(queue.poll());
					node.left = left;
					nextLevel.add(node.left);
				}else{
					node.left = null;
					queue.poll();
				}
				if(queue.peek()!= null){
					TreeNode right = new TreeNode(queue.poll());
					node.right = right;
					nextLevel.add(node.right);
				
				}else{
					node.right = null;
					queue.poll();
				}
			}
			curLevel = nextLevel;
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializeandDeserializeBinaryTree test = new SerializeandDeserializeBinaryTree();
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		//test.deserialize(test.serialize(root));
		test.serialize(test.deserialize("[1,2,3]"));
	}

}
