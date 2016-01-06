import java.util.Stack;

/**
 * 
 * @author chenqun
 * Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. 
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 *
 */
//维护一个栈stack<character> st来存最后的结果，先scan一次input,构造一个字典int[],记录每个char出现次数，然后第二次扫描，用st来存最后在string里的character
//第二次扫描维护一个boolean[] visited,来记录每个字符是否存在当前存储结果的stack里，因为每个字符在结果里只会出现一次，所以如果visited显示某个字符已经在stack里，就不用再添加同样的字符了
//开始第二次扫描的时候，count[]变成每个字符剩下的次数
//遇到一个字符，count-1,如果字符已存在，则continue
//对于新加入的字符c，见擦汗当前栈顶往下依次各个字符是不是比c大，而且后面还有这些字符，如是，则pop它们
public class RemoveDuplicateLetters {

	public String removeDuplicateLetters(String s){
		if(s == null || s.length() == 0)
			return "";
		Stack<Character> stack = new Stack<Character>();
		int[] count = new int[26];
		boolean[] visited = new boolean[26];
		for(int i=0; i<s.length(); i++){
			count[s.charAt(i)-'a']++;
		}
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			count[c - 'a']--;
			if(visited[c-'a']) continue;
			while(!stack.isEmpty() && stack.peek()>c && count[stack.peek()-'a']>0){
				visited[stack.peek()-'a'] = false;
				stack.pop();
			}
			stack.push(c);
			visited[c-'a'] = true;
		}
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		sb.reverse();
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
