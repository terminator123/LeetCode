/**
 * 
 * @author chenqun
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * For example,Given [5, 7, 7, 8, 8, 10] and target value 8,return [3, 4].
 *
 */
public class SearchForARange {

	public static int[] searchRange(int[] nums,int target){
		int[] result = new int[2];
		result[0] = -1;
		result[1] = -1;
		int left = 0;
		int right = nums.length-1;
		if(nums.length == 1 && nums[0] == target)
		{
			result[0] = 0;
			result[1] = 0;
		}
		while(left <= right){
			int mid = (left + right)/2;
			if(target == nums[mid])
			{
				int temp1 = mid;
				int temp2 = mid;
				while(temp1 >= 0 && nums[temp1--] == target)
					result[0] = temp1+1;
				while(temp2 < nums.length && nums[temp2++] == target)
					result[1] = temp2-1;
				return result;
			}else if(target < nums[mid])
				right = mid - 1;
			else if(target > nums[mid])
				left = mid + 1;
		}	
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3,4,4,4,5,6,7,8,8};
		int[] result = searchRange(nums,9);
		System.out.println(result[0] + " " + result[1]);
	}

}
