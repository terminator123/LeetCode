import java.util.Stack;

/**
 * 
 * @author chenqun
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * Some examples: ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
//由于逆波兰表达式本身不需要括号来限制哪个运算该先进行，因此可以直接利用栈来模拟计算：遇到操作数直接压栈，碰到操作符直接取栈顶的2个操作数进行计算（注意第一次取出来的是右操作数）
public class EvaluateReversePolishNotation {

	public int evalRPN(String[] tokens){
		if(tokens == null || tokens.length == 0) return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int tmp ;
		for(int i=0; i<tokens.length; i++){
			if(tokens[i].equals("+")){
				tmp = stack.pop() + stack.pop();
				stack.push(tmp);
			}else if(tokens[i].equals("-")){
				tmp =  -1 * stack.pop() + stack.pop();
				stack.push(tmp);
			}else if(tokens[i].equals("*")){
				tmp =  stack.pop() * stack.pop();
				stack.push(tmp);
			}else if(tokens[i].equals("/")){
				int a = stack.pop();
				tmp =  stack.pop() / a;
				stack.push(tmp);
			}else {
				tmp = Integer.valueOf(tokens[i]);
				stack.push(tmp);
			}
		}
		return stack.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"-78","-33","196","+","-19","-","115","+","-","-99","/","-18","8","*","-86","-","-","16","/","26","-14","-","-","47","-","101","-","163","*","143","-","0","-","171","+","120","*","-60","+","156","/","173","/","-24","11","+","21","/","*","44","*","180","70","-40","-","*","86","132","-84","+","*","-","38","/","/","21","28","/","+","83","/","-31","156","-","+","28","/","95","-","120","+","8","*","90","-","-94","*","-73","/","-62","/","93","*","196","-","-59","+","187","-","143","/","-79","-89","+","-"};
		EvaluateReversePolishNotation  test = new EvaluateReversePolishNotation ();
		System.out.println(test.evalRPN(tokens));
	}

}
