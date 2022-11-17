package Assignmnet_4th_Day_Array;

public class Que6_LCM_HCF_Number {
	static int lcm(int a, int b) {
		return b == 0 ? a : lcm(b, a % b);
	}

	
	static int LCMNumber(int[] arr, int i) {
		int a;
		int b;
		
		if (i == arr.length - 1) {
			return arr[i];
		}
		a = arr[i];
		b = LCMNumber(arr, i+ 1);
		return (a * b / lcm(a, b)); //
	}

	static int HCFNumber(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return arr[idx];
		}
		int a = arr[idx];
		int b = HCFNumber(arr, idx + 1);
		return lcm(a, b);
	}

	public static void main(String[] args) {

		int[] arr1 = { 2, 7, 3, 9, 4,6,8 };
		System.out.print("LCM Number = "+LCMNumber(arr1, 0) + "\n");
		 
		 System.out.print("HCF number = "+HCFNumber(arr1, 0));
		}
	}

