package _14_02_2018;

public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int karta = (int) (1 + (Math.random() * 13));
		int znak = (int) (1 + (Math.random() * 4));
		String s = null;

		if (znak == 1)
			s = "srce";

		if (znak == 2)
			s = "pik";
		else if (znak == 3)
			s = "djetelina";
		else
			s = "kocka";

		if (karta == 1)
			System.out.println("Karta koju ste izvukli je: " + s + " A");

		else if (karta == 11)
			System.out.println("Karta koju ste izvukli je: " + s + " J");
		else if (karta == 12)
			System.out.println("Karta koju ste izvukli je: " + s + " Q");
		else if (karta == 13)
			System.out.println("Karta koju ste izvukli je: " + s + " K");

		else
			System.out.println("Karta koju ste izvukli je: " + s + " " + karta);

	}

}
