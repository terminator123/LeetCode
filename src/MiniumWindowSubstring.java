package TwoPointers;
/**
 * 
 * @author chenqun
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * For example,S = "ADOBECODEBANC",T = "ABC" Minimum window is "BANC".
 */
//双指针 尾指针不断往后扫，当扫到有一个窗口包含了所有T的字符，然后再收缩头指针，直到不能再收缩为止。最后记录所有可能的情况中窗口最小的
public class MiniumWindowSubstring {

	public String minWindow(String s, String t){
		if(t.length() == 0 || s.length() == 0 || t == null || s == null)
			return "";
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		for(int i=0; i<t.length(); i++){
			count1[t.charAt(i)] ++;
			count2[t.charAt(i)] ++;
		}
		int count = t.length();
		int start = 0;
		int minSize = Integer.MAX_VALUE;
		int minstart = 0;
		for(int end=0; end < s.length(); end++){
			if(count2[s.charAt(end)] > 0){ //t中有该字符
				count1[s.charAt(end)]--;
				if(count1[s.charAt(end)] >=0 )
					count --;
			}
			if(count == 0){  //有效的一个end
				while(true){
					if(count2[s.charAt(start)] > 0){
						if(count1[s.charAt(start)]< 0 )
							count1[s.charAt(start)] ++;
						else break;   //start 到 end之间 包含 t,t中的字符至少有一个
					}
					start ++;
				}
				if(minSize > end -start + 1){
					minSize = end -start + 1;
					minstart = start;
				}
			}
		}
		if(minSize == Integer.MAX_VALUE)
			return "";
		String ret = s.substring(minstart, minstart + minSize);
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
