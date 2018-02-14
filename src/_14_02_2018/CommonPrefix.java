package _14_02_2018;

import java.util.Scanner;

public class CommonPrefix {

	public static String commonPrefix(String s1, String s2) {
		int i = s1.length();
		int count = 0;
		if (s2.length() > s1.length()) {
			i = s2.length();
		}

		for (int k = 0; k < i; k++) {
			if (s1.charAt(k) != s2.charAt(k)) {
				break;
			}
			count++;
		}
		return s1.substring(0, count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite prvi string: ");
		String s1 = input.nextLine();

		System.out.println("Unesite drugi string: ");
		String s2 = input.nextLine();

		String prefix = commonPrefix(s1, s2);

		if (prefix.length() > 0) {
			System.out.println("Zajednicki prefix je: " + prefix);
		} else {
			System.out.println("Dva stringa nemaju zajednicki prefix.");
		}
		input.close();
	}

}
