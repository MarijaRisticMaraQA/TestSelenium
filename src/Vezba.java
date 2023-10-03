public class Vezba {

	public static void main(String[] args) {

		// Vezba 5 - Print the sum of two operands int type where first operand has value 2 and the second has value 3.
		int operand1 = 2;
		int operand2 = 3;
		int sum = operand1 + operand2;

		System.out.println(sum);

		// Vezba 6
		int a = 2;
		int b = 3;

		/*
		System.out.println("First operand: ");
		System.out.println(a);
		System.out.println("Second operand: ");
		System.out.println(b);
		System.out.println("Sum: ");
		*/
		System.out.println(a+b);

		// Zadatak 1
		int x = 25;
		int y = 35;
		int z = 45;

		int[] currentPosition = {x, y, z};
		System.out.println("Your current position is: ");
		System.out.println(currentPosition[0]);

		// Vezba 14

		int c = 523134;
		int d = 325423;

		int modulo = c % d;

		if (modulo == 0) {

			System.out.println("Ostatak ne postoji.");
		} else if (modulo > 1000){

			System.out.println("Ostatak je veci od 1000.");
		} else if (modulo < 1000) {

			System.out.println("Ostatak je manji od 1000");
		}
	}
}
