import java.util.Stack;

/**
 * 
 * @author chenqun
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
//������ջ���������ݣ�һ���������������ݣ���һ�����浱ǰ��С�����ݣ���java�Դ���stack
public class MinStack {

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minstack = new Stack<Integer>();
	public void push(int x){
		if(minstack.isEmpty() || x <= minstack.peek())
			minstack.push(x);
		stack.push(x);
	}
	public void pop(){
		if(stack.peek().equals(minstack.peek()))
			minstack.pop();
		stack.pop();
	}
	public int getMin(){
		return minstack.peek();
	}
	public int top(){
		return stack.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack test = new MinStack();
		test.push(2);
		test.push(0);
		test.push(-1);
		test.getMin();
		test.top();
		test.pop();
		test.getMin();
	}

}
