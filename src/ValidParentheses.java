/**
 * 
 * @author chenqun
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * Subscribe to see which companies asked this question
 *
 */
//Ñ¹Õ»µÄ·½·¨
public class ValidParentheses {

	public boolean isValid(String s){
		StringBuilder tmp = new StringBuilder();
		for(int i = 0; i < s.length(); i ++){
			if(s.charAt(i) == '(' ||s.charAt(i) == '{'||s.charAt(i) == '[' )
			{
				tmp.append(s.charAt(i));
			}else if(s.charAt(i) == ')' ||s.charAt(i) == '}'|| s.charAt(i) == ']'){
				if(tmp.length() == 0)
					return false;
				else if(isPair(tmp.charAt(tmp.length()-1),s.charAt(i)))
					tmp.deleteCharAt(tmp.length()-1);
				else return false;
			}
		}
		if(tmp.length() == 0)
			return true;
		else
			return false;
	}
	public boolean isPair(char a,char b){
		if(a == '(' && b ==')')
			return true;
		else if(a == '{' && b =='}')
			return true;
		else if(a == '[' && b ==']')
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses test = new ValidParentheses();
		System.out.println(test.isValid("(){}[{}]"));
	}

}
