package Assignmnet_3rd_Day_String;

public class Que2_AlphabatesAscending_And_DescendingOrder {

	static final int MAX_CHAR = 26;

	static void Ascending(String str) {
		System.out.println("String in Ascending Order:- ");

		int l[] = new int[26];

		for (char x : str.toCharArray()) {

			l[x - 'a']++;
		}

		for (int i = 0; i < MAX_CHAR; i++) {
			for (int j = 0; j < l[i]; j++) {
				System.out.print((char) (i + 'a'));
			}
		}

		for (int i = MAX_CHAR - 1; i > 0; i--) {
			for (int j = l[i] - 1; j > 0; j--) {
				System.out.println("String In Acscending Order = ");
				System.out.print((char) (i + 'z'));

			}
		}
		System.out.println("      ");
		System.out.println("String in Descending Order :- ");
	}

	static void DescendingString(String str) {

		int charCount[] = new int[MAX_CHAR];

		for (int i = 0; i < str.length(); i++) {

			charCount[str.charAt(i) - 'a']++;
		}

		for (int i = MAX_CHAR - 1; i >= 0; i--) {
			for (int j = 0; j < charCount[i]; j++) {

				System.out.print((char) ('a' + i));
			}

		}

	}

	public static void main(String[] args) {
		Ascending("dcbakjlifehg");
		DescendingString("dcbakjlifehg");

	}

}
