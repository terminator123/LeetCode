/**
 * 
 * @author chenqun
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. 
 * You may assume that each input would have exactly one solution
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
import java.util.Arrays;

public class ThreeSumClosest {

	public int threeSumCloest(int[] nums,int target){
		int i = 0;
		for(i=0 ; i<1000; i++){
			if(getTarget(nums,target+i))
				return target + i;
			else if(getTarget(nums,target-i))
				return target-i;
		}
		return 0;
	}
	public boolean getTarget(int[] nums,int p ){
		Arrays.sort(nums);
		for(int i=0 ; i <nums.length-2 ; i++){
			if(i > 0 && nums[i] == nums[i - 1]) continue;           // Skip same results
			int j = i+1; //Õ∑÷∏’Î
			int k= nums.length - 1; //Œ≤÷∏’Î
			int target = p - nums[i];
			while(j < k) {
			    int sum = nums[j] + nums[k];
			    if(sum == target) {
			    	return true;
			    }
			    else if(sum < target)
			        ++j;
			    else
			        --k;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumClosest test = new ThreeSumClosest();
		int[] nums = {0,0,0};
		int target = 1;
		System.out.println(test.getTarget(nums, 0));
		System.out.println(test.threeSumCloest(nums, target));
	}

}
