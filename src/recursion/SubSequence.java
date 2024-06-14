package recursion;

public class SubSequence {

	public static void main(String[] args) {

		char[] array = {'a','b','c','d','e'};
		String str = "";

		System.out.println(
		displayArray(array, 0, str));
	}

	private static String displayArray(char[] array, int idx, String str) {

		if (idx == array.length) {
			return str;
		}
		
		str = str + array[idx];
		System.out.println(str);
		
		displayArray(array, idx + 1,str);
		
		return str;

	}

}
