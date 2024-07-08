package _01_StringTrimmer;

public class StringTrimmer {

	/*
	 * This method removes the specified number of characters from the right
	 * side of the specified string and returns the trimmed string. 
	 */
	static public String trimString(String str, int removesLeft) {
		// 1. If there are no removes left
		if (removesLeft <= 0) {
			// 2. Return the string
			System.out.println(str);
			return str;
		} else {
			// 3. Else you need to remove the last letter from the string,
			//    reduce removesLeft by 1, and then call trimString() 
			StringBuilder build = new StringBuilder(str);
			build.delete(build.length()-1, build.length());

			removesLeft--;
			str = build.toString();
			trimString(str, removesLeft);
		}
		return trimString(str, removesLeft);
	}
}
