import java.util.Stack;

/**
 * 
 * @author chenqun
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 */
// ����stack��s2�洢s1����ǰ��ĳ���ֵĵ���
public class ImplementQueueUsingStacks {

	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();
	public void push(int x){
		s1.push(x);
	}
	public void pop(){
		if(!s2.isEmpty()) s2.pop();
		else{
			while(!s1.isEmpty())
				s2.push(s1.pop());
			s2.pop();
		}
	}
	public int peek(){
		if(!s2.isEmpty())
			return s2.peek();
		else{
			while(!s1.isEmpty())
				s2.push(s1.pop());
			return s2.peek();
		}
	}
	public boolean empty(){
		return s1.isEmpty() && s2.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
