/**
 * @author chenqun
 *Given a string, find the length of the longest substring without repeating characters. 
 *For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public static int longthOfLongestSubString(String s){
		int length_max = 0;
		for(int i = 0; i < s.length(); i ++){
			int[] letter = new int[300];  // used  to tag the number if existed before
			letter[s.charAt(i)]  = 1;
			int j ;
			for( j = i+1 ; j < s.length(); j ++){
				if(letter[s.charAt(j)] == 0)
				{
					letter[s.charAt(j)] = 1; 
				}else 
					break;
			}
			if(j - i > length_max)
				length_max = j - i;
		}
		return length_max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bvbca";
		int n = longthOfLongestSubString(s);
		System.out.println(n);
	}

}
