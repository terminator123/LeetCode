package Tree;
/**
 * 
 * @author chenqun
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * For example,Given n = 3, there are a total of 5 unique BST's.
 */
//��ѧ�Ƶ���ÿ������������Ϊ���ڵ㣬�����������Ϊ���ڵ�ʱ������С������Ϊ��ڵ㣬�����������Ϊ�ҽڵ㣬�����������ڵ�����*�ҽڵ�����
//��̬�滮
public class UniqueBinarySearchTree {

	public int numTrees(int n){
		int[] nums = new int[1024];
		nums[0] = 1;
		nums[1] = 1;
		nums[2] = 2;
		if(n >=3){
			int i = 3;
			while(i <= n){
				for(int j=1; j<=i;j++){
					nums[i] = nums[i] + nums[j-1]*nums[i-j];
				}
				i++;
			}
		}
		return nums[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueBinarySearchTree test = new UniqueBinarySearchTree();
		System.out.println(test.numTrees(3));
	}

}
