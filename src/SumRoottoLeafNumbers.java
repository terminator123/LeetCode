package Tree;

import ListNode.TreeNode;

/**
 * 
 * @author chenqun
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * Find the total sum of all root-to-leaf numbers.
 *
 */
//¶þ²æÊ÷µÄÇî¾¡ËÑË÷
public class SumRoottoLeafNumbers {
	int sum = 0;
	public int sumNumbers(TreeNode root){
		if(root == null)
			return 0;
		run(root,0);
		return sum;
	}

	public void run(TreeNode root ,int num){
		num = num * 10 + root.val;
		if(root.left == null && root.right == null){
			sum = sum + num;
		}
		if(root.left != null){
			run(root.left,num);
		}
		if(root.right != null){
			run(root.right,num);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
