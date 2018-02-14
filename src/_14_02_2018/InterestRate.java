package _14_02_2018;

import java.util.Scanner;

public class InterestRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double iznos = 100;
		double kamatnaStopa = 1 + 0.00417;
		double suma = 0;

		System.out.println("Koliko mjeseci zelite da stedite: ");
		int mjeseci = input.nextInt();

		for (int i = 0; i < mjeseci; i++) {
			suma = (iznos + suma) * kamatnaStopa;
		}
		System.out.println("Iznos sume je : " + suma);
		input.close();
	}

}
