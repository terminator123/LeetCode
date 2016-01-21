package Tree;
/**
 * @author chenqun
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {

	public List<Integer> rightSideView(TreeNode root){
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		//BFS
		LinkedList<TreeNode> currentLevel = new LinkedList<TreeNode>();
		if(root != null)
			currentLevel.add(root);
		while(!currentLevel.isEmpty()){
			LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
			List<Integer> list = new ArrayList<Integer>();
			for(TreeNode node:currentLevel){
				list.add(node.val);
				if(node.left != null)
					nextLevel.add(node.left);
				if(node.right != null)
					nextLevel.add(node.right);
			}
			ans.add(list);
			currentLevel = nextLevel;
		}
		List<Integer> ret = new ArrayList<Integer>();
		for(int i=0;i <ans.size(); i++){
			List<Integer> list = new ArrayList<Integer>();
			list = ans.get(i);
			ret.add(list.get(list.size()-1));
		}
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
