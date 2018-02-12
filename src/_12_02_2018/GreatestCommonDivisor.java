package _12_02_2018;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite prvi broj: ");
		int number1 = input.nextInt();
		System.out.println("Unesite drugi broj: ");
		int number2 = input.nextInt();

		System.out.println("Najveci zajednicki djelilac je: " + gcd(number1, number2));
		input.close();
	}

	public static int gcd(int number1, int number2) {
		int gcd = 0;
		for (int i = 1; i <= number1 / 2; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
