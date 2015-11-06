/**
 * 
 * @author chenqun
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * Have you thought about this?
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, 
 * then the reverse of 1000000003 overflows. How should you handle such cases?
 * Throw an exception? Good, but what if throwing an exception is not an option? You would then have to 
 * re-design the function (ie, add an extra parameter).
 */
public class ReverseInter {

	public int reverse(int x){
		String tmp = "";
		if( x ==0 )
			return 0;
		if(x < 0){
			x = -x;
			while(x > 0){
				tmp = tmp + x%10;
				x = x/10;
			}
			tmp = "-" + tmp;
		}else{
			while(x > 0){
				tmp = tmp + x%10;
				x = x/10;
			}
		}
		try{
			int result = Integer.parseInt(tmp);
			return result ;
		}catch(Exception e){
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1230;
		ReverseInter test = new ReverseInter();
		System.out.println(test.reverse(x));
	}

}
