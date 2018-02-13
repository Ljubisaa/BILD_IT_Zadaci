package _13_02_2018;

import java.util.Scanner;

public class PrimeNumbers {
	public static void primeNumbers(int number1, int number2, int i) {
		int count = 0;
		int j;
		if (number1 >= number2) {
			System.out.println("Pocetni broj treba da je veci od krajneg.");
		}

		else {
			System.out.println("Prosti brojevi su: ");
			for (int k = number1; k < number2; k++) {
				for (j = 2; j < k; j++) {
					if (k % j == 0) {
						break;
					}
				}
				if (k == j) {
					System.out.print(k + " ");
					count++;
					if (count % i == 0) {
						System.out.println();
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite pocetni broj: ");
		int number1 = input.nextInt();
		System.out.println("Unesite krajni broj: ");
		int number2 = input.nextInt();
		int i = 10;

		primeNumbers(number1, number2, i);
		input.close();
	}

}
