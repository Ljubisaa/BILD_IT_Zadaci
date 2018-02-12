package _12_02_2018;

import java.util.ArrayList;

public class ArrayListMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(6);
		list.add(3452);
		list.add(349898);

		if (max(list) == null) {
			System.out.println("Lista je prazna.");
		} else {
			System.out.println("Najveca vrijednost u listi je: " + max(list));
		}
	}

	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			return null;
		} else {
			int max = list.get(0);

			for (int i : list) {
				if (i > max) {
					max = i;
				}
			}
			return max;
		}

	}

}
