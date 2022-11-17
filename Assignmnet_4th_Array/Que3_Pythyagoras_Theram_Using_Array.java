package Assignmnet_4th_Day_Array;

public class Que3_Pythyagoras_Theram_Using_Array {
	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 6, 7, 8,9 };
		int count = 0;

		for (int i = 0; i <= arr.length-1; i++) {
			int x = arr[i];
for(int j=0;j<arr.length;j++) {
	int y=arr[j];
	for(int k=0;k<arr.length;k++) {
		int z=arr[k];
		if((z*z)==(x*x+y*y)){
			count++;
			System.out.println(x+" "+y+" "+z);
			
		}
		
	}
}
			
			
		}
	}
}
