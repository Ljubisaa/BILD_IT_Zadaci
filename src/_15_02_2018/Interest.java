package _15_02_2018;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite iznos investicije: ");
		double investicija = input.nextDouble();

		System.out.println("Unesite godisnju interesnu stopu:");
		double godisnjaStopa = input.nextDouble();

		System.out.println("Unesite broj godina: ");
		int godine = input.nextInt();

		System.out.println("Buduca vrijednost investicije je: " + buducaVrijednost(investicija, godisnjaStopa, godine));
		input.close();
	}

	public static double buducaVrijednost(double investicija, double godisnjaStopa, int godine) {
		double mjesecnaStopa = godisnjaStopa / 1200;

		double buducaInvesticija = investicija * Math.pow(1 + mjesecnaStopa, godine * 12);
		return buducaInvesticija;
	}

}
