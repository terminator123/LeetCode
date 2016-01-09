/**
 * 
 * @author chenqun
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
 *
 */
//代码参考自http://www.acmerblog.com/largest-rectangle-in-histogram-6117.html
//用动态规划，用到了延伸，最后的结果中肯定是至少有一个柱子已经达到顶了
public class LargestRectangleinHistogram {
	public int largestRectangleArea(int[] height) {
		int ans = 0;
		int n = height.length;
		int left[] = new int[n + 1];
		int right[] = new int[n + 1];
		processLR(height, left, right);
		for (int i = 1; i <= n; i++) {
			int tmp = (right[i] - left[i] + 1) * height[i - 1];
			if (ans < tmp)
				ans = tmp;
		}
		return ans;
	}

	public static void processLR(int heights[], int left[], int right[]) {
		int n = heights.length;
		// 用临时数组，设置两个哨兵
		int tempArr[] = new int[n + 2];
		tempArr[0] = -1;
		for (int i = 1; i <= n; i++)
			tempArr[i] = heights[i - 1];
		tempArr[tempArr.length - 1] = -1;
		for (int i = 1; i <= n; i++) { //算法复杂度最好的情况是O(N)
			int k = i;
			while (tempArr[i] <= tempArr[k - 1])
				k = left[k - 1];
			left[i] = k;
		}
		for (int i = n; i > 0; i--) {
			int k = i;
			while (tempArr[i] <= tempArr[k + 1])
				k = right[k + 1];
			right[i] = k;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
