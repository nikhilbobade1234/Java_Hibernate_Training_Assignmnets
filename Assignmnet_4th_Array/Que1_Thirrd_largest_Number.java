package Assignmnet_4th_Day_Array;

public class Que1_Thirrd_largest_Number {
	static void thirdLargest(int arr[], int arr_Length) {

		int first = arr[0];
		for (int i = 1; i < arr_Length; i++)
			if (arr[i] > first)
				first = arr[i];

		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr_Length; i++)
			if (arr[i] > second && arr[i] < first)
				second = arr[i];

		int third = Integer.MIN_VALUE;
		for (int i = 0; i < arr_Length; i++)
			if (arr[i] > third && arr[i] < second)
				third = arr[i];

		System.out.printf("The third Largest Number = ", third);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 13, 12, 10, 34, 16 };
		int n = arr.length;
		thirdLargest(arr, n);
	}
}
