package _15_02_2018;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite pocetnu godinu:");
		int pocetna = input.nextInt();

		System.out.println("Unesite krajnju godinu:");
		int krajnja = input.nextInt();

		prestupneGodine(pocetna, krajnja);
		input.close();
	}

	public static void prestupneGodine(int pocetna, int krajnja) {

		GregorianCalendar kalendar = new GregorianCalendar();

		int count = 0;
		System.out.println("Prestupne godine su: ");
		for (int i = pocetna; i <= krajnja; i++) {
			if (kalendar.isLeapYear(i)) {
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}

		}
	}
}
