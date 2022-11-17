package Assignmnet_4th_Day_Array;

public class Que4_odd_Even_Prime_perfect_Prime {
	public static void main(String[] args) {
		int oddcount = 0;
		int Evencount = 0;
		int PrimeCount = 0;
		int perfectcount = 0;
		int arr[] = { 4, 3, 2, 6, 7, 8, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				Evencount++;
			} else if (arr[i] % 2 != 0) {
				oddcount++;

			}

			if (isPrimeNumber(arr[i])) {
				PrimeCount++;
			}

			if (isPerfectNumber(arr[i])) {
				perfectcount++;

			}

		}
		System.out.println("Total Perfect Number =" + perfectcount);
		System.out.println("Total Even Number = " + Evencount + "\n  Total Odd Number = " + oddcount);
		System.out.println("Total prime numbers = " + PrimeCount);
		
	}

	private static boolean isPerfectNumber(int n) {
int sum = 0;
		
for(int i = 1; i < n; i++)

{

    if(n % i == 0)

    {

        sum = sum + i;

    }

}

if(sum == n)

{
	
	return true;
	
}
return false;


            

       
	}

	private static boolean isPrimeNumber(int i) {
		int count = 0;

		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				count = 1;

			}
		}
		if (count > 0) {
			
			return true;
		}else {
			return false;
		}
	}

}
