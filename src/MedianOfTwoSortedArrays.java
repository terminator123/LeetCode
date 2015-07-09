/**
 * 
 * @author chenqun
 *There are two sorted arrays nums1 and nums2 of size m and n respectively. 
 *Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *assume the array is ascending order,use the merging order
 *the time complexity is O(m+n)
 */
public class MedianOfTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2){
		int m = nums1.length;
		int n = nums2.length;
		int[] nums3 = new int[n+m] ;
		int i = 0,j = 0 ,k = 0;
		for(i = 0; i < m + n && j < m && k < n; i ++){
			if(nums1[j] < nums2[k])
			{
				nums3[i] = nums1[j++];
			}else{
				nums3[i] = nums2[k++];
			}
		}
		if( j == m  ){
			for(;i < m + n && k < n ; i ++){
				nums3[i] = nums2[k++];
			}
		}else if ( k == n){
			for(;i < m + n && j < m ; i ++){
				nums3[i] = nums1[j++];
			}
		}
		if((m+n) % 2 == 0)
			return (nums3[(m+n)/2-1] + nums3[(m+n)/2])/2.0 ;
		else 
			return nums3[(m+n)/2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1 };
		int[] b = {1};
		double result = findMedianSortedArrays(a,b);
		System.out.println(result);
	}

}
