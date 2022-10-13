package Assignmnet_3rd_Day_String;

public class Que6_SCP_Heap_Memory {
	public static void main(String[] args) {
		String s1 = "Nikhil";
		String s2 = "Nikhil";
		System.out.println("On the Basis of Memory");
		if (s1 == s2)
			System.out.println("Both are equal And stored in scp memory");
		else
			System.out.println("Both are not equals");
		System.out.println("------------------------------");
		System.out.println("Memory Address " + s1.hashCode());
		System.out.println("Memory Address " + s2.hashCode());
		System.out.println("===================================");
		String s3 = new String("Akash");
		String s4 = new String("Akash");
		if (s3 == s4)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are not Equals");
		System.out.println("=========================");
		if(s3.equals(s4));
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("memory Address "+s3.hashCode());
		System.out.println("Memory Address "+s4.hashCode());
		

	}
}
