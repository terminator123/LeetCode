/**
 * 
 * @author chenqun
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are 
 * adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 */
public class SortColors {

	public void sortColors(int[] nums)
	{
		quickSort(nums,0,nums.length-1);
	}
	public void quickSort(int[] data, int low, int high){
		int q;
		if(low < high)
		{
			q = partition(data,low,high);
			quickSort(data,q+1,high);
			quickSort(data,low,q-1);
		}
	}
	
	public int partition(int[] data,int low,int high){
		int key = data[low];
		while(low < high){
			while(high > low && data[high] >= key)
				high --;
			data[low] = data[high];
			while(high > low && data[low] < key)
				low ++;
			data[high] = data[low];
		}
		data[low] = key; //把轴元素放在轴所在的位置上
		return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColors test = new SortColors();
		int[] data = {0,1};
		test.quickSort(data, 0, 1);
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}

}
