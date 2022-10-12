package HomeWork;

import java.util.Scanner;

public class Binary_to_Decimal_DEsimal_To_Binary_2nd_Way {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int num1dec = convertBinaryToDecimal(num1);
		int num2dec = convertBinaryToDecimal(num2);
		
		int res = num1dec + num2dec;
		System.out.println(res);

		decToBinary(res);

	}

	public static int convertBinaryToDecimal(int num) {
		int N = 0, i = 0;
		int r;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			N += r * Math.pow(2, i);
			++i;
		}

		return N;
	}

	static void decToBinary(int n) {

		int[] BinaryNum = new int[32];

		int i = 0;
		while (n > 0) {

			BinaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(BinaryNum[j]);
	}
}
