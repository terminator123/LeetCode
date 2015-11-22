/**
 * 
 * @author chenqun
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 * For example,Given input array nums = [1,1,2],
 *
 */
public class RemoveDuplicatesfromSortedArray {

	public int removeDuplicates(int[] nums){
		int count = 1;
		for(int i=1; i<nums.length ; i++){
			if(nums[i] == nums[i-1])
			{
				continue;
			}else{
				nums[count] = nums[i];
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
		RemoveDuplicatesfromSortedArray test = new RemoveDuplicatesfromSortedArray();
		System.out.println(test.removeDuplicates(nums));
	}

}
