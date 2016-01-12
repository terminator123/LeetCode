package TwoPointers;
/**
 * 
 * @author chenqun
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,"A man, a plan, a canal: Panama" is a palindrome."race a car" is not a palindrome.
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s){
		//‘§¥¶¿Ì
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c <= '9' && c >= '0')
				sb = sb.append(c);
			else if( c <= 'Z' && c >= 'A'){
				char ch = (char) (c + 'a' -'A');
				sb = sb.append(ch);
			}
			else if(c <= 'z' && c >= 'a')
				sb = sb.append(c);
		}
		int length = sb.length();
		String tmp = sb.toString();
		sb.reverse();
		for(int i=0; i<length/2; i++){
			if(sb.charAt(i) != tmp.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aA";
		ValidPalindrome test = new ValidPalindrome();
		System.out.println(test.isPalindrome(s));
	}

}
