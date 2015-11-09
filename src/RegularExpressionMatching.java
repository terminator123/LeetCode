/**
 * 
 * @author chenqun
 *Implement regular expression matching with support for '.' and '*'.
 *
 */
// the answer is from http://segmentfault.com/a/1190000000453572, I have just read and understood it 
public class RegularExpressionMatching{ 
	    public boolean isMatch(String s, String p) {
	        int slen = s.length();
	        int plen = p.length();
	        if (slen == 0 && plen == 0) return true;
	        char c0 = getChar(s, 0);
	        char p0 = getChar(p, 0), p1 = getChar(p, 1);
	        if (match(c0, p0) || p1 == '*') {
	            if (p1 != '*') {
	                if (slen == 0) return false;
	                return isMatch(s.substring(1), p.substring(1));
	            }
	            // if p1 is *, * means 0 ~ n
	            int i = 0;
	            boolean ret = isMatch(s.substring(0), p.substring(2)); // try 0
	            if (ret) return ret;
	            while (i < slen && match(getChar(s, i), p0)) {
	                ret = isMatch(s.substring(i+1), p.substring(2)); // try for every available position
	                if (ret) return ret;
	                i++;
	            }
	        }

	        return false;
	    }
	    public boolean match(char a, char b) {
	        return a == b || b == '.';
	    }

	    public char getChar(String s, int p) {
	        if (s.length() > p) {
	            return s.charAt(p);
	        }
	        return 0;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularExpressionMatching test = new RegularExpressionMatching();
		System.out.println(test.isMatch("0", "0*"));
		
	}

}
