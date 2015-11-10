/**
 * 
 * @author chenqun
 *Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 *n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
 *Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 */
//容积总是由最短板决定，每次移动短板找出最大容积
public class ContainerWithMostWater {

	public int maxArea(int[] height){
		int start = 0 ;
		int end = height.length - 1;
		int maxArea = 0;
		while(start < end){
			int area = Math.min(height[start],height[end])*(end - start);
			maxArea = Math.max(maxArea, area);
			if(height[start] <= height[end]){
				start ++;
			}else{
				end --;
			}
		}
		return maxArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
