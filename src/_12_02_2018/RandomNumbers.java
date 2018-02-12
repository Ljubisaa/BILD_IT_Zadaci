package _12_02_2018;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int niz[] = new int[100];
		int brojac[] = new int[100];

		for (int i = 0; i < niz.length; i++) {
			int broj = (int) (Math.random() * 10);
			niz[i] = broj;
			brojac[broj]++;
		}

		for (int i = 0; i < niz.length; i++) {
			if (brojac[i] != 0) {
				System.out.println("Broj " + i + " se ponavlja " + brojac[i] + " puta.");
			}
		}

	}

}
