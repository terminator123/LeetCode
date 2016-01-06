import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * @author chenqun
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
 * You may assume that the given expression is always valid.
 */
//遇到 '(' 就把之前的结果和符号push进stack. 遇到')'就把 当前结果*stack中的符号 再加上stack中之前的结果.
public class BasicCalculator {

	public int calculate(String s){
		if(s == null ||s.length() == 0) return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int res = 0;
		int sign = 1;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(Character.isDigit(c)){
				int cur = c-'0';
				while(i+1<s.length() && Character.isDigit(s.charAt(i+1))){
					cur = cur*10 + s.charAt(++i)-'0';
				}
				res = res + sign * cur;
			}else if(c == '+')
				sign = 1;
			else if(c == '-')
				sign = -1;
			else if(c == '('){
				stack.push(res);
				stack.push(sign);
				res = 0;
				sign = 1;
			}else if(c == ')'){
				res = stack.pop()*res + stack.pop();
				sign = 1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator test = new BasicCalculator();
		int result = test.calculate("(1+(4+5+2)-3)+(6+8) ");
		System.out.println(result);
	}

}
