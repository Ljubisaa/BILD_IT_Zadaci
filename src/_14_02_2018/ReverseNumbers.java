package _14_02_2018;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] niz = new int[10];

		System.out.println("Unesite elemente niza: ");

		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextInt();
		}

		System.out.println("Obrnuti redosled je: ");
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}
		input.close();
	}

}
