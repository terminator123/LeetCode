import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author chenqun
 * Implement the following operations of a stack using queues.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 */
//把q1前n-1个都放进q2中
public class ImplementStackUsingQueues {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	public void push(int x){
		q1.offer(x);
	}
	//remove the element on top of the stack
	public void pop(){
		while(q1.size()>1) q2.offer(q1.poll());
		q1.poll();
		Queue<Integer> tmp = q1;
		q1 = q2;
		q2 = tmp;
	}
	//get the top element 
	public int top(){
		while(q1.size()>1) q2.offer(q1.poll());
		int x = q1.poll();
		q2.offer(x);
		Queue<Integer> tmp = q1;
		q1 = q2;
		q2 = tmp;
		return x;
	}
	// return whether the stack is empty
	public boolean empty(){
		return q1.isEmpty() ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStackUsingQueues test = new ImplementStackUsingQueues();
		test.push(1);
		test.push(2);
		System.out.println(test.top());
	}

}
