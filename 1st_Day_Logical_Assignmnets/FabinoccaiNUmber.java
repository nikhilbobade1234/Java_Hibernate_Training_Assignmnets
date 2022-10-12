package Assignments_1st_Day_Logical;

public class FabinoccaiNUmber {
public static void main(String[] args) {
	int n1=1;
	int n2=2;
	int n3;
	System.out.print(n1+" "+n2);

	for(int i=0;i<10;i++) {
			n3=n1+n2;
		System.out.print(" "+n3);
	
		n1=n2;
		n2=n3;
}
}
}