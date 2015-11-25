/**
 * 
 * @author chenqun
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 */
//¿Õ×Ö·û´®ÊÇÈÎÒâ×Ö·û´®µÄ×Ö´®
public class ImplementstrStr {

	public int strStr(String haystack, String needle) {
		if(needle.length() == 0)
			return 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				if (i + needle.length() > haystack.length())
				{
					return -1;
				}
				else {
					for (int j = 0; j < needle.length(); j++) {
						if (needle.charAt(j) != haystack.charAt(i + j))
						{
							break;
						}
						if(j==(needle.length()-1) && needle.charAt(j) == haystack.charAt(i + j))
						{
							return i;
						}
					}
					
				}
			}
			System.out.println(i);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementstrStr test = new ImplementstrStr();
		System.out.println(test.strStr("a", "a"));
	}

}
