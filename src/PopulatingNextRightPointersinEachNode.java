package Tree;

import java.util.LinkedList;

/**
 * 
 * @author chenqun
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 */
//BFS นใหั
public class PopulatingNextRightPointersinEachNode {


	public void connect(TreeLinkNode root){
		if(root == null) return;
		LinkedList<TreeLinkNode> curLevel = new LinkedList<TreeLinkNode>();
		curLevel.add(root);
		while(!curLevel.isEmpty()){
			LinkedList<TreeLinkNode> nextLevel = new LinkedList<TreeLinkNode>();
			for(int i=0; i<curLevel.size()-1;i++){
				curLevel.get(i).next = curLevel.get(i+1);
			}
			curLevel.get(curLevel.size()-1).next = null;
			for(TreeLinkNode node : curLevel){
				if(node.left != null)
					nextLevel.add(node.left);
				if(node.right != null)
					nextLevel.add(node.right);
			}
			curLevel = nextLevel;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
