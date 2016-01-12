package TwoPointers;
/**
 * 
 * @author chenqun
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeroes {

	public void moveZeroes(int[] nums){
		int indexzero = 0;
		int indexnon_zero = 0;
		while(indexzero < nums.length && indexnon_zero < nums.length){
			while(indexzero < nums.length && nums[indexzero] != 0){
				indexzero ++;
			}
			if(indexzero == nums.length)
				break;
			indexnon_zero = indexzero;
			while(indexnon_zero < nums.length && nums[indexnon_zero] == 0 ){
				indexnon_zero ++;
			}
			if(indexnon_zero < nums.length && indexzero < nums.length  ){
				nums[indexzero] = nums[indexnon_zero];
				nums[indexnon_zero] = 0;
				indexzero ++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,1,0,3,12};
		MoveZeroes test = new MoveZeroes();
		test.moveZeroes(nums);
		System.out.println(nums[0]);
	}

}
