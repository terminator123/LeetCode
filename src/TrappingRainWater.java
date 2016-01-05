/**
 * 
 * @author chenqun
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * For example, Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
//头尾指针向最高度靠拢，左边指针小于最高，右边指针小于最高，就可以计算面积
public class TrappingRainWater {

	public int trap(int[] height){
		if(height.length < 2 ) return 0;
		int maxheight = 0;
		int mid = 0;
		for(int i=0; i<height.length; i++){
			if(height[i] > maxheight){
				maxheight = height[i];
				mid = i;
			}
		}
		int left = 0;
		int right = height.length - 1;
		int tmp = 0;
		int area = 0;
		for(int i=1; i<=mid; i++){
			if(height[i] < height[left])
				tmp = tmp + height[i];
			else{
				area = area + height[left]*(i-left-1) - tmp;
				tmp = 0;
				left = i;
			}
		
		}
		tmp = 0;
		for(int i=height.length-2; i>=mid; i--){
			if(height[i] < height[right])
				tmp = tmp + height[i];
			else{
				area = area + height[right]*(right-i-1) - tmp;
				tmp = 0;
				right = i;
			}
		}
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrappingRainWater test = new TrappingRainWater();
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(" " + test.trap(height));
	}

}
