package _13_02_2018;

import java.util.Scanner;

public class SmallestElement {

	public static double min(double[] array) {
		double min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] niz = new double[10];
		System.out.println("Unesite vrijednosti niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextDouble();

		}

		System.out.println("Najmanja vrijednost u nizu je: " + min(niz));
		input.close();
	}

}
