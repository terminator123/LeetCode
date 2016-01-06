import java.util.Stack;

/**
 * 
 * @author chenqun
 * Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. 
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 *
 */
//ά��һ��ջstack<character> st�������Ľ������scanһ��input,����һ���ֵ�int[],��¼ÿ��char���ִ�����Ȼ��ڶ���ɨ�裬��st���������string���character
//�ڶ���ɨ��ά��һ��boolean[] visited,����¼ÿ���ַ��Ƿ���ڵ�ǰ�洢�����stack���Ϊÿ���ַ��ڽ����ֻ�����һ�Σ��������visited��ʾĳ���ַ��Ѿ���stack��Ͳ��������ͬ�����ַ���
//��ʼ�ڶ���ɨ���ʱ��count[]���ÿ���ַ�ʣ�µĴ���
//����һ���ַ���count-1,����ַ��Ѵ��ڣ���continue
//�����¼�����ַ�c����������ǰջ���������θ����ַ��ǲ��Ǳ�c�󣬶��Һ��滹����Щ�ַ������ǣ���pop����
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
