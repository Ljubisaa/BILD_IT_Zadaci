package _14_02_2018;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String s = input.nextLine();
		System.out.println("U ovom stringu ima " + countLetters(s) + " slova.");

		input.close();
	}

	public static int countLetters(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
