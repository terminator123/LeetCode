/**
 * 
 * @author chenqun
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class RomantoInteger {
	public int romanToInt(String s){
		int ret = toNumber(s.charAt(0));
		for(int i =1  ; i < s.length(); i++){
			if(toNumber(s.charAt(i-1)) < toNumber(s.charAt(i)))
			{
				ret = ret + toNumber(s.charAt(i)) - 2 * toNumber(s.charAt(i-1));
			}else{
				ret = ret + toNumber(s.charAt(i));
			}
		}
		return ret;
	}
	public int toNumber(char ch){
		switch(ch){
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
