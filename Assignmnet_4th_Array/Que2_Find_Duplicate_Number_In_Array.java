package Assignmnet_4th_Day_Array;

public class Que2_Find_Duplicate_Number_In_Array {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7, 7, 8, 8, 9 };
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j])
			System.out.println("Duplicate number in Array = "+arr[j]);
		
	}
	
}
	}

}
