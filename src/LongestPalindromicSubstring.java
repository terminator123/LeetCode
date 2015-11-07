/**
 * 
 * @author chenqun
 *Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {
		public String longestPalindrome(String s) {
	        String result = null ;
	        int tag = 0;
	        int length = 0;
	        for(int i=0; i<s.length(); i++ ){
	        	//not sysmetric
	        	for(int j=0; j<=i && j+i <s.length(); j++){
	        		if(s.charAt(i-j) == s.charAt(i+j)){
	        			//length ++ ;
	        			if(2*j >= length){
	        				length = j * 2 + 1;
	        				tag = i;
	        			}
	        		}else{
	        			break;
	        		}
	        	}
	        	//sysmetric
	        	for(int j=0; j<=i && j+i+1 <s.length(); j++){
	        		if(s.charAt(i-j) == s.charAt(i+j+1)){
	        			//length ++ ;
	        			if(2 * (j + 1 ) >=length){
	        				length = 2 * (j + 1 );
	        				tag = i;
	        			}
	        		}else{
	        			break;
	        		}
	        	}
	        }
	        if(length %2 == 0){
	        	result = s.substring(tag-length/2 + 1 , tag+length/2+1);
	        }else{
	        	result = s.substring(tag-length/2, tag+length/2+1);
	        }
	        return result;
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s = "abccc";
			LongestPalindromicSubstring test = new LongestPalindromicSubstring();
			String r = test.longestPalindrome(s);
			System.out.println(r);


		}

}
