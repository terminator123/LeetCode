/**
 * 
 * @author chenqun
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT.
 *
 */
//用位运算，考虑-2147483648的情况
public class DivideTwoIntegers {
	
	public int divide(int dividend, int divisor){
		int sign = 1;
		if(dividend < 0) sign = -sign;
		if(divisor < 0) sign = -sign;
		long temp1 = Math.abs((long)dividend);
		long temp2 = Math.abs((long)divisor);
		long res = 0;
		while(temp1 >= temp2){
			long temp3 = temp2;
			int i=0;
			for(i=0; temp1 >= temp3; i++){
				temp3 = temp3<<1;
			}
			i--;
			res = res + Math.abs((long)(1<<i));
			temp1 = temp1 - (temp3>>1);
		}
		if(sign > 0 && res == (long)(Integer.MAX_VALUE)+1) return  Integer.MAX_VALUE;
		else if(sign>0) return (int)res;
		else return -(int)res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideTwoIntegers  test = new DivideTwoIntegers ();
		System.out.println(test.divide(-2147483648, 2));
	}

}
