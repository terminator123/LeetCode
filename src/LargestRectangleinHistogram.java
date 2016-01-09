/**
 * 
 * @author chenqun
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
 *
 */
//����ο���http://www.acmerblog.com/largest-rectangle-in-histogram-6117.html
//�ö�̬�滮���õ������죬���Ľ���п϶���������һ�������Ѿ��ﵽ����
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
		// ����ʱ���飬���������ڱ�
		int tempArr[] = new int[n + 2];
		tempArr[0] = -1;
		for (int i = 1; i <= n; i++)
			tempArr[i] = heights[i - 1];
		tempArr[tempArr.length - 1] = -1;
		for (int i = 1; i <= n; i++) { //�㷨���Ӷ���õ������O(N)
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
