/**
 * 
 * @author chenqun
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 *  (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
public String convert(String s, int numRows) {
        int length = s.length();
        if(numRows == 1)
        	return s;
        int delta = 2 * numRows -2;
        int t = length / delta;
        String tmp = "";
        for(int i=0; i<numRows; i++){
        	for(int j = 0; j<t+1; j++){
        		if(i != 0 && i!= numRows-1){
        			if(delta*j + i < length)
        				tmp = tmp + s.charAt(delta*j + i);
        			if(delta*j + delta - i < length)
        				tmp = tmp + s.charAt(delta*j + delta  - i);
        		}else
        		{
        			if(delta*j + i < length)
        				tmp = tmp + s.charAt(delta*j + i) ;
        		}
        	}
        }
        return tmp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		ZigZagConversion test = new ZigZagConversion();
		String tmp = test.convert(s,3);
		System.out.println(tmp);
	}

}
