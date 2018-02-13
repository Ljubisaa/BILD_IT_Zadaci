package _13_02_2018;

import java.util.Scanner;

public class Max2DArray {

	public static int[] locateLargest(double[][] a) {
		double max = a[0][0];
		int[] location = new int[2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite broj redova niza:");
		int i = input.nextInt();
		System.out.println("Unesite broj kolona niza: ");
		int j = input.nextInt();

		double[][] niz = new double[i][j];

		System.out.println("Unesite elemente niza: ");
		for (int k = 0; k < niz.length; k++) {
			for (int l = 0; l < niz[k].length; l++) {
				niz[k][l] = input.nextDouble();
			}
		}

		System.out.println("Najveci element u nizu je na mjestu: ");
		for (int n = 0; n < 2; n++) {
			System.out.print(locateLargest(niz)[n] + " ");
		}
		input.close();
	}

}
