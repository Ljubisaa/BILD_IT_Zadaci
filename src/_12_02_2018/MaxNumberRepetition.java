package _12_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNumberRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int max = 0;
		int numberMax = 0;
		int number = -1;
		ArrayList<Integer> list = new ArrayList<>();
		

		while (number != 0) {

			System.out.println("Unesite broj, 0 prekida unos: ");
			number = input.nextInt();
			list.add(number);

			if (number > max) {
				max = number;
			}

		}
		for (int i : list) {
			if (i == max) {
				numberMax++;
			}
		}
		System.out.println("Najveci broj u nizu je " + max + " i ponavlja se " + numberMax + " puta.");
		input.close();
	}

}
