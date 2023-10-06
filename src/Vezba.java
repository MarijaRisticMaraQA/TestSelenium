import java.util.Arrays;

public class Vezba {

	public static void main(String[] args) {

		// Vezba 5 - Print the sum of two operands int type where first operand has value 2 and the second has value 3.
		int operand1 = 2;
		int operand2 = 3;
		int sum = operand1 + operand2;

		System.out.println(sum);

		// Vezba 6
		System.out.println("_________________________");

		int a = 2;
		int b = 3;

		/*
		System.out.println("First operand: ");
		System.out.println(a);
		System.out.println("Second operand: ");
		System.out.println(b);
		System.out.println("Sum: ");
		*/
		System.out.println(a + b);

		// Zadatak 1
		System.out.println("_________________________");

		int x = 25;
		int y = 35;
		int z = 45;

		int[] currentPosition = { x, y, z };
		System.out.println("Your current position is: ");
		System.out.println(currentPosition[0]);

		// Vezba 14
		System.out.println("_________________________");

		int c = 523134;
		int d = 325423;

		int modulo = c % d;

		if (modulo == 0) {

			System.out.println("Ostatak ne postoji.");
		} else if (modulo > 1000) {

			System.out.println("Ostatak je veci od 1000.");
		} else if (modulo < 1000) {

			System.out.println("Ostatak je manji od 1000");
		}

		// Vezba 15
		System.out.println("_________________________");

		String carMake = "Ford";
		int doors = 4;

		if (carMake.equals("Ford")) {

			System.out.println("Broj vrata je: " + doors);
		}

		// Vezba mnozenje
		System.out.println("_________________________");

		for (int i = 1; i <= 10; i++) {

			if (i == 1) {

				System.out.println("**********");
				System.out.println("#  1  2  3");
				System.out.println("**********");
			}

			System.out.println(i + "  " + (i * 1) + "  " + (i * 2) + "  " + (i * 3));
		}

		// Vezba 2D niz
		System.out.println("_________________________");

		int[][] arr2d = new int[][] {
				{ 1, 2, 8 },
				{ 3, 4, 10 },
				{ 5, 6, 15 }
		};

		for (int i = 0; i < arr2d.length; i++) {

			for (int j = 0; j < arr2d[i].length; j++) {

				System.out.print(arr2d[i][j] + " ");
			}
			System.out.println();
		}

		// Vezba: Napraviti niz od 5 clanova tipa int i ispisati najveci clan niza, tj pronaci maksimalnu vrednost.
		//Sortirati isti niz.
		System.out.println("_________________________");

		int[] fiveNumbersArr = {5, 2, 7, 9, 3};
		int maxNumber = fiveNumbersArr[0];

		for (int i = 0; i < fiveNumbersArr.length; i++) {

			if (fiveNumbersArr[i] > maxNumber) {

				maxNumber = fiveNumbersArr[i];
			}
		}
		System.out.println("Najveci clan niza je: " + maxNumber);

		Arrays.sort(fiveNumbersArr);

		System.out.println("Sorted list: " + Arrays.toString(fiveNumbersArr));
		System.out.println("_________________________");
	}
}
