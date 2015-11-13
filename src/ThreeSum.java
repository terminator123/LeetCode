/**
 * @author chenqun
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 *  Find all unique triplets in the array which gives the sum of zero.
 *  Elements in a triplet (a,b,c) must be in non-descending order. (ie, a °‹ b °‹ c)
 *  The solution set must not contain duplicate triplets.
 */
import java.util.*;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] num)
	{
		List<List<Integer>> list = new ArrayList<List<Integer>>() ;
		 if(num == null || num.length < 2) return list;
		Arrays.sort(num);
		for(int i=0 ; i <num.length-2 ; i++){
			if(i > 0 && num[i] == num[i - 1]) continue;           // Skip same results
			int j = i+1; //Õ∑÷∏’Î
			int k= num.length - 1; //Œ≤÷∏’Î
			int target = 0 - num[i];
			while(j < k) {
			    int sum = num[j] + num[k];
			    if(sum == target) {
			    	List<Integer> solution = new ArrayList<Integer>();
			        solution.add(num[i]);
			        solution.add(num[j]);
			        solution.add(num[k]);
			        if(!list.contains(solution))
			        	list.add(solution);
			         ++j;
			         --k;
			    }
			    else if(sum < target)
			        ++j;
			    else
			        --k;
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSum test = new ThreeSum();
		int[] s = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
		System.out.println(test.threeSum(s));
	}

}
