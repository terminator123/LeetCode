/**
 * 
 * @author chenqun
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 1 is read off as "one 1" or 11.11 is read off as "two 1s" or 21.21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 *
 */
public class CountAndSay {

	public String countAndSay(int n){
		String result = "1";
		int i = 1;
		while(i<n)
		{
			i++;
			result = countNum(result);
		}
		return result;
		
	}
	public String countNum(String result){
		
		char tmp = result.charAt(0);
		int num = 1;
		String ret = new String();
		for(int k=1; k<result.length();k++){
			if(result.charAt(k) == tmp)
			{
				num ++;
				continue;
			}
			ret = ret + num + tmp;
			num = 1;
			tmp = result.charAt(k);
		}
		ret = ret + num + tmp;
		return ret ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountAndSay test = new CountAndSay();
		System.out.println(test.countAndSay(5));
	}

}
