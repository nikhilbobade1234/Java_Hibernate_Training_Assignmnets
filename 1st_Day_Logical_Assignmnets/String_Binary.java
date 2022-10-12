package HomeWork;

import java.util.Scanner;

public class String_Binary {
public static void main(String[] args) {
	Integer b1, b2;
    int i = 0, c = 0;



   int[] sum = new int[10];



   Scanner sc = new Scanner(System.in);



   System.out.print("Enter first binary number: ");
    b1=Integer.valueOf(sc.next());

   System.out.print("Enter second binary number: ");
    b2 =Integer.valueOf(sc.next());



   while (b1 != 0 || b2 != 0) {
        sum[i++] = (int) ((b1 % 10 + b2 % 10 + c) % 2);
        c = (int) ((b1 % 10 + b2 % 10 + c) / 2);
        b1 = b1 / 10;
        b2 = b2 / 10;
    }
    if (c != 0) {
        sum[i++] = c;
    }
    --i;
	 System.out.print("Addition of two string Binary value : "); 
    while (i >= 0) {
        System.out.print(String.valueOf(sum [i--]));
    }

}
}

