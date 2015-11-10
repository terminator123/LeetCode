/**
 * 
 * @author chenqun
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class IntegertoRoman {
	public String intToRoman(int num){
		String[][] roman = {
				 {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},  
		         {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  
		         {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  
		         {"", "M", "MM", "MMM"}
				
		};
		String ret = "";
		int i=0;
		while(num!=0){
			int remain = num % 10;
			ret = roman[i][remain] + ret;
			i ++;
			num = num/10;
		}
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
