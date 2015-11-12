/**
 * 
 * @author chenqun
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
// compare the result before with the new row of strs
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs){
		String common = "";
		//init common
		if(strs.length > 0)
			common = strs[0];
		for(int i=1; i < strs.length; i++){
			common = commonPrefix(common,strs[i]);
			if(common == "")
				break;
		}
		return common;
	}
	public String commonPrefix(String str1,String str2){
		String common = "";
		for(int i=0; i< Math.min(str1.length(), str2.length()); i++){
			if(str1.charAt(i) == str2.charAt(i)){
				common = common + str1.charAt(i);
			}else
				break;
		}
		return common;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
