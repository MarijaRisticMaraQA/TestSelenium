import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Unesite prvi broj: ");
		double operand1 = scanner.nextDouble();

		System.out.println("Unesite drugi broj: ");
		double operand2 = scanner.nextDouble();

		System.out.println("Unesite operator");
		String operator = scanner.next();

		if (operator.equals("+")) {

			System.out.println("Rezultat je: " + (operand1 + operand2));
		}else if (operator.equals("-")) {

			System.out.println("Rezultat je: " + (operand1 - operand2));
		}else if (operator.equals("/")) {

			if (operand2 !=0) {

				System.out.println("Rezultat je: " + (operand1 / operand2));
			}else {
				System.out.println("Deljenje sa nulom nije dozvoljeno");
			}

		}else if (operator.equals("*")) {

			System.out.println("Rezultat je: " + (operand1 * operand2));
		}
	}
}