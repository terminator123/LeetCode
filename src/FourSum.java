/**
 * @author chenqun
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ¡Ü b ¡Ü c ¡Ü d)
 * The solution set must not contain duplicate quadruplets.
 *  For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 *   A solution set is: (-1,  0, 0, 1)(-2, -1, 1, 2)(-2,  0, 0, 2)
 */
// refer to the solution of three sum
import java.util.*;
public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 3)
        	return list;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++){
        	if(i > 0 && nums[i] == nums[i - 1]) continue; 
        	for(int j=i+1; j<nums.length-2; j++){
        		int m = j+1;
        		int n = nums.length-1;
        		int temp = target - nums[i] -nums[j];
        		while(m < n){
        			int sum = nums[m] + nums[n];
        			if(sum == temp){
        				List<Integer> solution = new ArrayList<Integer>();
    			        solution.add(nums[i]);
    			        solution.add(nums[j]);
    			        solution.add(nums[m]);
    			        solution.add(nums[n]);
    			        if(!list.contains(solution))
    			        	list.add(solution);
    			         ++m;
    			         --n;
        			}else if(sum < temp)
        				++m;
        			else 
        				--n;
        		}
        	}
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourSum test = new FourSum();
		int[] s = {0,0,0,0};
		System.out.println(test.fourSum( s, 0));
	}

}
