/**
 * @author chenqun
 * You are given an integer array nums and you have to return a new counts array. 
 * The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//用二分查找，从数组的最后一个开始插入，对遍历过的数维持一个有序的数组，用findindex()来找第一个比它大或等于的数
//比如【5 2 3 6 1】，从后向前得到有序数列【1 3 6】，插入2，返回index为1，2应该插入的位置，也是比2小的数的个数，即逆序数

public class CountOfSmallerNumbersAfterSelf {

	public List<Integer> countSmaller(int[] nums){
		Integer[] ans = new Integer[nums.length];
		List<Integer> sorted = new ArrayList<Integer>();
		for(int i=nums.length-1; i>=0; i--){
			int index = findIndex(sorted,nums[i]);
			ans[i] = index;
			sorted.add(index, nums[i]);
		}
		return Arrays.asList(ans);
	}
	public int findIndex(List<Integer> sorted, int target){
		if(sorted.size() == 0) return 0;
		int start = 0;
		int end = sorted.size() - 1;
		if(sorted.get(end) < target) return end+1;
		if(sorted.get(start) >= target) return 0;
		while(start + 1 < end){
			int mid = start + (end - start)/2;
			if(sorted.get(mid) < target){
				start = mid + 1;
			}else{
				end = mid;
			}
		}
		if(sorted.get(start) >= target) return start;
		return end;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
