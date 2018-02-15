package _15_02_2018;

import java.util.Scanner;

public class OddLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite neki string: ");

		String s = input.nextLine();

		System.out.println("Neparni karakteri u ovom stringu su: ");

		for (int i = 0; i < s.length(); i += 2) {
			System.out.print(s.charAt(i));
		}
		input.close();
	}

}
