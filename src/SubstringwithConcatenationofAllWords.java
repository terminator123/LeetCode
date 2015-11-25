/**
 * @author chenqun
 * You are given a string, s, and a list of words, words, that are all of the same length.
 *  Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
 *  For example, given:s: "barfoothefoobarman"words: ["foo", "bar"]You should return the indices: [0,9].
 */
//time linit exceed , 另外有一种滑动窗口的方法，然后并没有看懂。。
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class SubstringwithConcatenationofAllWords {
	public List<Integer> findSubString(String s, String[] words){
		List<Integer> res = new ArrayList<Integer>();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		int wlen = words[0].length();
		int len = words.length * wlen;
		if(s.length() < len || s == null || words == null || s.length() ==0 || words.length == 0 )
			return res;
		for(int i = 0; i<words.length; i++){
			if(map.containsKey(words[i])){
				map.put(words[i], map.get(words[i]) + 1);
			}else{
				map.put(words[i], 1);
			}
		}
		for(int i=0; i <= s.length()-len;i++){
			String tmp = "";
			tmp = s.substring(i, i+wlen);
			if(map.containsKey(tmp)){
				HashMap<String,	Integer> curMap = new HashMap<String,Integer>();
				boolean flag = true;
				for(int j=i;j<i+len;j=j+wlen){
					String tmpStr = s.substring(j, j+wlen);
				
					if(!map.containsKey(tmpStr))
					{
						flag = false;
						break;
					}
					if(!curMap.containsKey(tmpStr)){
						curMap.put(tmpStr, 1);
					}else{
						if(curMap.get(tmpStr) > map.get(tmpStr))
						{
							flag = false;
							break;
						}
							
						curMap.put(tmpStr, curMap.get(tmpStr) + 1);
					}
					}
				if(flag)
					res.add(i);
				}
			}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstringwithConcatenationofAllWords  test = new SubstringwithConcatenationofAllWords();
		String s = "barfoothefoobarman";
		String[] words = {"foo","bar"};
		System.out.println(test.findSubString(s, words));
	}

}
