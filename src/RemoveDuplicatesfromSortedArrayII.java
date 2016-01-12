package TwoPointers;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author chenqun
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesfromSortedArrayII {

	public int removeDuplicates(int[] nums){
		if(nums == null || nums.length ==0) return 0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i=0; i<nums.length; i++){
			if( !map.containsKey(nums[i])){
				map.put(nums[i], 1);
				nums[count] = nums[i];
				count ++;
			}else if(map.containsKey(nums[i])){
				if(map.get(nums[i]) == 1){
					map.put(nums[i], 2);
					nums[count] = nums[i];
					count ++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
