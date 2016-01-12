package TwoPointers;
/**
 * 
 * @author chenqun
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 */
//从后往前开始合并
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n){
		int end1 = m-1;
		int end = m + n -1;
		for(int end2=n-1; end2>=0; end2--){
			if(end1 < 0 || nums2[end2] > nums1[end1]){
				nums1[end--] = nums2[end2];
			}else{
				nums1[end--] = nums1[end1];
				end1 --;
				end2 ++;
			}	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[2];
		nums1[0] = 2;
		nums1[1] = 0;
		int[] nums2 = {1};
		MergeSortedArray test = new MergeSortedArray();
		test.merge(nums1, 1, nums2, 1);
	}

}
