package _15_02_2018;

import java.util.Scanner;

public class LengthForFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite brzinu aviona: ");
		double v = input.nextDouble();

		System.out.println("Unesite ubrzanje aviona:");
		double a = input.nextDouble();

		System.out.println("Minimalna duzina piste potrebna za uzletanje je: " + v * v / (2 * a));

		input.close();
	}

}
