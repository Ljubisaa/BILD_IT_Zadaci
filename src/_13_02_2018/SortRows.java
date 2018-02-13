package _13_02_2018;

import java.util.Scanner;

public class SortRows {

	public static double[][] sortRows(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = j + 1; k < array[i].length; k++) {
					if (array[i][j] > array[i][k]) {
						double temp = array[i][j];
						array[i][j] = array[i][k];
						array[i][k] = temp;
					}
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] array = new double[3][3];

		System.out.println("Unesite elemente niza: ");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		sortRows(array);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
