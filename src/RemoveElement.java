/**
 * 
 * @author chenqun
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 */
public class RemoveElement {

	public int remobeElement(int[] nums, int val){
		int len = nums.length;
	
		int count = 0;
		for(int i=0; i<len ;i++){
			if(nums[i] != val)
			{
				nums[count] = nums[i];
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement test = new RemoveElement();
		int[] nums = {1,1,2,3};
		System.out.println(test.remobeElement(nums, 1));
		
	}

}
