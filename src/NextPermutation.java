/**
 * 
 * @author chenqun
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * The replacement must be in-place, do not allocate extra memory.
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 �� 1,3,2	3,2,1 �� 1,2,3	1,1,5 �� 1,5,1
 */
public class NextPermutation {

	public void nextPermutation(int[] nums){
		//�Ӻ���ǰ��nums[i]<nums[i+1]���ٴӺ���ǰ�Ҵ���a[i]����С��a[j]��a[i] a[j]����������a[i]֮���reverse
		int tag = -1;
		for(int i=nums.length-1;i>0;i--){
			if(nums[i-1]<nums[i])
			{
				tag = i-1;
				break;
			}
		}
		if(tag == -1){
			//ԭ���Ѿ��ǽ��� reverseȫ��
			reverse(nums,0,nums.length-1);
		}else{
			int tag2 = tag+1 ;
			for(int i = nums.length-1; i > tag;i--){
				if(nums[i]>nums[tag] ){
					tag2 = i;
					break;
				}
			}
			int temp = nums[tag2];
			nums[tag2] = nums[tag];
			nums[tag] = temp;
			reverse(nums,tag+1,nums.length-1);
		}
	}
	public void reverse(int[] nums,int begin,int end){
		for(int i=0;i<(end-begin)/2+1;i++){
			int temp = nums[begin+i];
			nums[begin+i] = nums[end-i];
			nums[end-i] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,4};
		NextPermutation test = new NextPermutation();
		test.nextPermutation(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}

}
