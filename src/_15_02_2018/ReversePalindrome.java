package _15_02_2018;

import java.util.Scanner;

public class ReversePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki broj: ");
		int number = input.nextInt();

		if (isPalindrome(number, reverse(number))) {
			System.out.println("Broj je palindrom.");
		} else {
			System.out.println("Broj nije palindrom.");
		}
		input.close();
	}

	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			int temp = number % 10;
			reverse = (reverse * 10) + temp;
			number = number / 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int number, int reverseNumber) {
		if (number != reverseNumber) {
			return false;
		}
		return true;
	}
}
