/**
 * 
 * @author chenqun Given a string containing just the characters '(' and ')',
 *         find the length of the longest valid (well-formed) parentheses
 *         substring. For "(()", the longest valid parentheses substring is
 *         "()", which has length = 2. Another example is ")()())", where the
 *         longest valid parentheses substring is "()()", which has length = 4.
 * 
 */
//动态规划，找到每个（对应的）
public class LongestValidParentheses {

	public int longestValidParentheses(String s) {
		int length = s.length();
		s = s + "#";
		int[] id = new int[s.length()];
		for (int i = 0; i < id.length; i++) {
			id[i] = -1;
		}
		if (s.length() <= 1)
			return 0;
		for (int i = length - 1; i >= 0; i--) {
			if (s.charAt(i) == '(') {
				int j = i + 1;
				while (s.charAt(j) == '(' && id[j] != -1)
					j = id[j] + 1;
				if (s.charAt(j) == ')')
					id[i] = j;
			}
		}
		int longest = 0;
		int cur = 0;
		for (int i = 0; i < length + 1;) {
			if (id[i] == -1) {
				longest = Math.max(cur, longest);
				cur = 0;
				i = i + 1;
			} else {
				cur = cur + id[i] - i + 1;
				i = id[i] + 1;
			}
		}
		return longest;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
