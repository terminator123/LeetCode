/**
 * @author chenqun
 * You are given an integer array nums and you have to return a new counts array. 
 * The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//�ö��ֲ��ң�����������һ����ʼ���룬�Ա���������ά��һ����������飬��findindex()���ҵ�һ�����������ڵ���
//���硾5 2 3 6 1�����Ӻ���ǰ�õ��������С�1 3 6��������2������indexΪ1��2Ӧ�ò����λ�ã�Ҳ�Ǳ�2С�����ĸ�������������

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
