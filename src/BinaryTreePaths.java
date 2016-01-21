package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author chenqun
 * Given a binary tree, return all root-to-leaf paths.
 *
 */
public class BinaryTreePaths {
	List<List<Integer>> ans  = new ArrayList<List<Integer>>();
	List<String> ret  = new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		if(root == null) return ret;
		dfs(root,list);
		for(int i=0; i<ans.size(); i++){
			String path = "";
			int length = ans.get(i).size();
			path = path + ans.get(i).get(0);
			for(int j=1; j<length;j++)
				path = path + "->" + ans.get(i).get(j);
			
			ret.add(path);
		}
		return ret;
	}
	public void dfs(TreeNode root,List<Integer> list){
		list.add(root.val);
		if(root.left == null && root.right == null){
			ans.add(new ArrayList(list));
			list.remove(list.size()-1);
			return;
		}
		if(root.left != null){
			dfs(root.left,list);
		}
		if(root.right != null){
			dfs(root.right,list);
		}
		list.remove(list.size()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
