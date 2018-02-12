package _12_02_2018;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite neki string: ");
		String s = input.nextLine();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				vowels++;
			} else if (Character.isLetter(s.charAt(i))) {
				consonants++;
			}
		}

		System.out.println("U stringu " + s + " ima " + vowels + " samoglasnika i " + consonants + " suglasnika.");
		input.close();
	}

}
