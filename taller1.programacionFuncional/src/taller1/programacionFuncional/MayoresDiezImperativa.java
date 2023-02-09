package taller1.programacionFuncional;

import java.util.List;

public class MayoresDiezImperativa {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

		int count = 0;

		for (int n : numbers) {
			if (n > 10) {
				count++;
			}
		}

		System.out.println("Total de números mayores que 10: " + count);
	}

}
