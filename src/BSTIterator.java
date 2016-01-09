/**
 * 
 * @author chenqun
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * Calling next() will return the next smallest number in the BST.
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 *
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
//�ⷨһ���õݹ�������� ����С����洢��stack ���캯��ʱ��ʼ��
//�ⷨ����next��hasnext�÷ǵݹ����������еĴ��룬�ο�http://www.programcreek.com/2014/04/leetcode-binary-search-tree-iterator-java/
public class BSTIterator{

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	Queue<Integer> queue = new LinkedList<Integer>();
	public void inorderTraversal(TreeNode root) {
		if( root != null) {
			if(root.left != null) inorderTraversal(root.left);
			queue.offer(root.val);
			if(root.right != null) inorderTraversal(root.right);
		}
	}
	public BSTIterator(TreeNode root){
		inorderTraversal(root);
	}
	public boolean hasNext(){
		return !queue.isEmpty();
	}
	public int next(){
		return queue.poll();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
