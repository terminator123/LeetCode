/**
 * 
 * @author chenqun
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *	You may assume no duplicate exists in the array.
 */
public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		int n = nums.length;
		if (n == 0)
			return -1;
		if (n == 1) {
			if (nums[0] == target)
				return 0;
			else
				return -1;
		}
		if (n == 2) {
			if (nums[0] == target)
				return 0;
			else if (nums[1] == target)
				return 1;
			else
				return -1;
		}
		int L = 0, R = n - 2;
		while (L < R)// [0,n-2]找一个比A[n-1]大的数
		{
			int mid = (L + R >> 1) + 1;
			if (nums[mid] > nums[n - 1])
				L = mid;
			else
				R = mid - 1;
		}
		int split = L;
		if (nums[L] < nums[n - 1])
			split = n - 1;
		// [0,split],[split+1,n-1]
		int ans;
		ans = search_2(nums, 0, split, target);
		if (ans != -1)
			return ans;
		if (split + 1 <= n - 1) {
			return search_2(nums, split + 1, n - 1, target);
		}
		return -1;
	}

	int search_2(int A[], int L, int R, int target) {
		while (L <= R) {
			int mid = (L + R) >> 1;
			if (A[mid] > target) {
				R = mid - 1;
			} else if (A[mid] < target) {
				L = mid + 1;
			} else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4, 5 };
		int target = 2;
		SearchInRotatedSortedArray test = new SearchInRotatedSortedArray();
		System.out.println(test.search(nums, target));
	}

}
