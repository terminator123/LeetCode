/**
 * @author chenqun
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 */
import java.util.ArrayList;
import java.util.List;

//ษ๎หัฃก
public class GenerateParentheses {
	public List<String> generateParenthesis(int n){
		List<String> result = new ArrayList<String>();
		if(n<0)
			return null;
		else{
			String str = new String();
			dfs(result,str,n,n);
		}
		return result;
	}
	public void dfs(List<String> list,String str,int left,int right){
		if(left>right) return;
		if(left==0&&right==0)
			list.add(str);
		if(left>0)
			dfs(list,str+'(',left-1,right);
		if(right>0)
			dfs(list,str+')',left,right-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParentheses gp = new GenerateParentheses();
	    System.out.println(gp.generateParenthesis(1));
	}

}
