package TwoPointers;
/**
 * 
 * @author chenqun
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * For example,S = "ADOBECODEBANC",T = "ABC" Minimum window is "BANC".
 */
//˫ָ�� βָ�벻������ɨ����ɨ����һ�����ڰ���������T���ַ���Ȼ��������ͷָ�룬ֱ������������Ϊֹ������¼���п��ܵ�����д�����С��
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
			if(count2[s.charAt(end)] > 0){ //t���и��ַ�
				count1[s.charAt(end)]--;
				if(count1[s.charAt(end)] >=0 )
					count --;
			}
			if(count == 0){  //��Ч��һ��end
				while(true){
					if(count2[s.charAt(start)] > 0){
						if(count1[s.charAt(start)]< 0 )
							count1[s.charAt(start)] ++;
						else break;   //start �� end֮�� ���� t,t�е��ַ�������һ��
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
