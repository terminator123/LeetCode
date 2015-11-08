/**
 * 
 * @author chenqun
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x){
		int length = 0;
		if( x == Integer.MIN_VALUE || x < 0)
			return false;
		int y = x;
		while(y>0){
			y = y/10;
			length ++;
		}
		y = (x > 0? x :-x);
		for(int i=0; i<=(length+1)/2; i++){
			if((int)(y / Math.pow(10, i)) %10 != (int)(y / Math.pow(10, length-i-1))%10)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber test = new PalindromeNumber();
		System.out.println(test.isPalindrome(-12344321));
	}
}
