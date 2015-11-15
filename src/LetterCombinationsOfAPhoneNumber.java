/**
 * @author chenqun
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * 
 */
//refer to the source in http://blog.csdn.net/hcbbt/article/details/44061179,there is a little mistake of his.Judge if the digits is ""
import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    private String[] alpha = new String[] {
            "",
            "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };
    private StringBuilder word;
   
    public void dfs(List<String> res,String digits, int cur){
    	if(cur >= digits.length()){
    		res.add(word.toString());
    	}else{
    		for(int i=0; i< alpha[digits.charAt(cur)-'0'].length() ;++i){
    			word.append(alpha[digits.charAt(cur)-'0'].charAt(i));
    			dfs(res,digits,cur+1);
    			word.deleteCharAt(word.length()-1);
    		}
    	}
    }
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        if(digits.equals(""))
        	return ret;
        word = new StringBuilder();
        dfs(ret, digits, 0);
        return ret;
    }
    
    public static void main(String[] args){
    	LetterCombinationsOfAPhoneNumber test = new LetterCombinationsOfAPhoneNumber();
    	System.out.println(test.letterCombinations(""));
    	
    }
}