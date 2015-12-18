/**
 * 
 * @author chenqun
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,s = "anagram", t = "nagaram", return true.s = "rat", t = "car", return false.
 * 本意是判断两个字符串中的字母出现次数是否一样
 */
public class ValidAnagram {

	public boolean isAnagram(String s,String t){
		int len_s = s.length();
		int len_t = t.length();
		if(len_s!=len_t)
			return false;
		int[] letter_s = new int[26];
		int[] letter_t = new int[26];
 		for(int i=0;i<len_s;i++){
 			letter_s[s.charAt(i)-'a'] ++;
 			letter_t[t.charAt(i)-'a'] ++;
 		}
 		for(int i=0; i<26; i++){
 			if(letter_s[i] != letter_t[i])
 				return false;
 		}
 		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
