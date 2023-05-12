package datad4;

public class ChangeChar {

	public static void main(String[] args) {
		String string = "baaaaaaaaabaa";
		String string1 = "baaaabbaabbba";
		String string2 = "baaaaaab";
		String string3 = "baabab";

		replaceLetter(string1);
		replaceLetter(string2);
		replaceLetter(string3);
		System.out.println(replaceLetter(string));

	}

	public static int replaceLetter(String string) {
		int count = 0;
		for (int i = 1; i < string.length() - 1; i++) {
			if ((string.charAt(i) == string.charAt(i - 1)) && (string.charAt(i) == string.charAt(i + 1))) {
				count++;
				i += 2;
			}
		}
		return count;
	}
}