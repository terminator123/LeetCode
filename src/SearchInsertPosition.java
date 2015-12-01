/**
 * 
 * @author chenqun
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.Here are few examples.[1,3,5,6], 5 ¡ú 2 [1,3,5,6], 2 ¡ú 1 [1,3,5,6], 7 ¡ú 4 [1,3,5,6], 0 ¡ú 0
 *
 */
//¶ş·Ö²éÕÒ
public class SearchInsertPosition {

	public static int searchInsert(int[] nums,int target){
		int left = 0;
		int right = nums.length-1;
		int mid = 0;
		while(left <= right){
			mid = (left + right)/2;
			if(target == nums[mid])
			{
				return mid;
			}else if(target < nums[mid])
				right = mid - 1;
			else if(target > nums[mid])
				left = mid + 1;
		}
		if(nums[mid] > target)
			return mid;
		else if(nums[mid] < target)
			return mid + 1;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums,6));
	}

}
