/**
 * 
 * @author chenqun
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones and return its area.
 *
 */
//���ǿ���һ��һ��ɨ�裬��¼����ÿһ��cell��ʼ����ߵ�bar��
//������
//1001010
//0101000
//��ô�Ե�һ�ж��ԣ�cell�ĸ߶���1001010, �ڶ�����0102000
//��ÿһ�м��㵽β��ʱ����Ը��еļ���Max Rectangle����������largetRectangleinHistogramһ��
public class MaximalRectangle {

	public int maximalRectangle(char[][] matrix){
		int ans = 0;
		if(matrix == null || matrix.length == 0)	return 0;
		int[][] mat = new int[matrix.length][];
		for(int i=0; i<matrix.length;i ++){
			mat[i] = new int[matrix[i].length];
			for(int j=0; j<matrix[i].length; j++){
				mat[i][j] = matrix[i][j]-'0';
				if(i>=1 && mat[i][j]!=0 )
					mat[i][j] = mat[i-1][j] + 1;
			}
			if(ans < largestRectangleArea(mat[i]))
				ans = largestRectangleArea(mat[i]);
		}
		return ans;
	}
	public int largestRectangleArea(int[] height){
		int ans = 0;;
		int n = height.length;
		int left[] = new int[n+1];
		int right[] = new int[n+1];
		processLR(height, left, right);
		for(int i=1; i<=n; i++){
			int tmp = (right[i] - left[i] + 1) * height[i-1];
			if(ans < tmp)
				ans = tmp;
		}
		return ans;
	}
	public static void processLR(int height[], int left[], int right[]){
		int n = height.length;
		//����ʱ���飬���������ڱ�
		int tmpArr[] = new int[n+2];
		tmpArr[0] = -1;
		for(int i=1; i<=n; i++){
			tmpArr[i] = height[i-1];
		}
		tmpArr[tmpArr.length - 1] = -1;
		for(int i=1; i<=n; i++){
			int k=i;
			while(tmpArr[i] <= tmpArr[k-1])
				k = left[k-1];
			left[i] = k;
		}
		for(int i=n; i>0; i--){
			int k = i;
			while(tmpArr[i] <= tmpArr[k+1])
				k = right[k+1];
			right[i] = k;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
