package Assignmnet_3rd_Day_String;

public class Que7_GarbageCollection {
	@Override
	public void finalize() {
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {

		Que7_GarbageCollection s1 = new Que7_GarbageCollection();
		System.out.println(s1.hashCode());
		s1 = null;

		System.gc();
//   String s4= s3.intern();
//   System.out.println(s4);

	}

}
