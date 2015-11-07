/**
 * 
 * @author chenqun
 *Implement atoi to convert a string to an integer.
 *Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 *Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 */
public class StringtoInteger {
	public static int myAtoi(String str) {
		if (str.length() == 0)
			return 0;
		str = str.trim();
		long result = 0;
		int sign = 1, i = 0;
		if (str.charAt(i) == '+')
			i++;
		else if (str.charAt(i) == '-') {
			sign = -1;
			i++;
		}

		for (int j = i; j < str.length(); j++) {
			if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
				result = result * 10 + (str.charAt(j) - '0');
				if (result > Integer.MAX_VALUE)
					return sign < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			} else
				break;
		}
		result *= sign;
		return (int) result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " 0x1";
		int result = myAtoi(str);
		System.out.println(result);
	}

}
