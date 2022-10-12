
package HomeWork;

import java.util.Scanner;

public class MenuDrivenCalculator {
	public static void main(String[] args) {

		double n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		n1 = sc.nextDouble();

		n2 = sc.nextDouble();

		String operation = sc.next();

		double Result = 0;

		switch (operation) {

		// Addition Of Numbers
		case "+":

			Result = n1 + n2;

			break;

		// Subtraction of two numbers
		case "-":

			Result = n1 - n2;

			break;

		// Multiply two numbers
		case "*":

			Result = n1 * n2;

			break;

		// division two numbers
		case "/":

			Result = n1 / n2;

			break;
		case "%":
			Result = n1 % n2;
			break;

		default:

			System.out.println(" You have enter wrong operation");

			break;

		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.println(operation + " of " + "number = " + n1 + " and " + "Number = " + n2 + " = " + Result);
	}

}
