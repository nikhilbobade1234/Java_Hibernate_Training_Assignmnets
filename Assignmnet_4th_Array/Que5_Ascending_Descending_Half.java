package Assignmnet_4th_Day_Array;

public class Que5_Ascending_Descending_Half {

	public static void main(String[] args) {

		int arr[] = {10, 5, 4, 6, 2, -1, 3, 8, 1,10 };
System.out.println("Ascending Order = ");
		for (int i = 0; i < arr.length / 2; i++) {
			for(int j=i+1; j<arr.length/2;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print( arr[i] +" " );
		}
System.out.println("\n Descending Order = ");
		for (int i = arr.length/2; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				int temp=0;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.print(arr[i]+" " );
		}
	}

}
