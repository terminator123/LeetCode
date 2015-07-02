
public class TwoSum {
	/* pro 1
	 * given an array of integers,find two numbers such that they add up to a specfic target number
	 * the function twosum should return indices of the two numbers such that they add up to the target,where index1 must be less than index2.please note that
	 * your returned answers (both index1 and index2) are not zero-base
	 * you may assum that each input would have exactly one solution
	 */

	/*
	 * accept 
	 * time complexity in worse case: O(n^2)
	 */
	public int[] twoSum(int[] nums, int target){
		int[] result = new int[2];
		for(int i = 0; i < nums.length; i++){
				for( int j = i + 1; j < nums.length; j++){
					if(nums[i] + nums[j] == target){
						result[0] = i + 1;
						result[1] = j + 1;
					}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
