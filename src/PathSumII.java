package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 *
 */
//不加28行 和 37行 ，报超时
public class PathSumII {
	List<List<Integer>> ans  = new ArrayList<List<Integer>>();
	public List<List<Integer>> pathSum(TreeNode root,int sum){
	
		List<Integer> list = new ArrayList<Integer>();
		if(root == null) return ans;
		run(root,0,sum,list);
		return ans;
	}
	public void run(TreeNode root,int num,int sum, List<Integer> list){
		num = num + root.val;
		list.add(root.val);
		if(root.left == null && root.right == null){
			if(num == sum ){
				ans.add(new ArrayList(list));
				list.remove(list.size()-1);
				return;
			}
		}
		if(root.left != null){
			run(root.left,num,sum,list);
		}
		if(root.right != null){
			run(root.right,num,sum,list);
		}
		list.remove(list.size()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(2);
		TreeNode left1 = new TreeNode(3);
		TreeNode right1 = new TreeNode(3);
		root.left = left;
		left.left = left1;
		left.right = right1;
		root.right = right;
		PathSumII test = new PathSumII();
		System.out.println(test.pathSum(root,6));
	}

}
