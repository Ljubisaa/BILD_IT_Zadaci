package _13_02_2018;

import java.util.Scanner;

public class EqualsArrays {

	public static boolean equals(int[] niz1, int[] niz2) {

		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite duzinu nizova:");
		int i = input.nextInt();

		int[] niz1 = new int[i];

		System.out.println("Unesite elemente prvog niza: ");
		for (int k = 0; k < niz1.length; k++) {

			niz1[k] = input.nextInt();
		}

		int[] niz2 = new int[i];
		System.out.println("Unesite elemente drugog niza:");
		for (int k = 0; k < niz2.length; k++) {

			niz2[k] = input.nextInt();
		}

		if (equals(niz1, niz2)) {
			System.out.println("Nizovi su striktno identicni.");
		} else {
			System.out.println("Nizovi nisu striktno identicni.");
		}
		input.close();
	}

}
