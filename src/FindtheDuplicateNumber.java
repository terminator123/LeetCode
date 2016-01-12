package TwoPointers;
/**
 * 
 * @author chenqun
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 * 
 */
//类似于二分查找
public class FindtheDuplicateNumber {

	public int findDuplicate(int[] nums){
		if(nums == null || nums.length ==0)
			return 0;
		int low = 0, high = nums.length-1,mid;
		while(low < high){
			mid = low +  (high-low)/2;
			int count=0;
			for(int i=0;i <nums.length; i++){
				if(nums[i] <= mid)
					count ++;
			}
			if(count > mid)
				high = mid ;
			else 
				low = mid + 1;
		}
		return low;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindtheDuplicateNumber test = new FindtheDuplicateNumber ();
		int[] nums = {1,2,3,3,3,4};
		System.out.println(test.findDuplicate(nums));
	}

}
