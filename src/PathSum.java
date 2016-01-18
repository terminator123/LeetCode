package Tree;
/**
 * 
 * @author chenqun
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 */
public class PathSum {


	boolean flag = false;
	public boolean hasPathSum(TreeNode root,int sum)
	{	
		if(root == null) return false;
		run(root,0,sum);
		return flag;
	}
	public void run(TreeNode root,int num,int sum){
		num = num + root.val;
		if(root.left == null && root.right == null){
			if(num == sum ){
				flag = true;
			}
		}
		if(root.left != null){
			run(root.left,num,sum);
		}
		if(root.right != null){
			run(root.right,num,sum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		root.left = left;
		PathSum test = new PathSum();
		System.out.println(test.hasPathSum(root, 3));
	}

}
