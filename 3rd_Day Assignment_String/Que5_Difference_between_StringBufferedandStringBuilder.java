package Assignmnet_3rd_Day_String;

public class Que5_Difference_between_StringBufferedandStringBuilder {

	public static void main(String[] args) {
		
		  long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("nikhil");  
	        for (int i=0; i<10000; i++){  
	            sb.append("bobade");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("nikhil");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Developer");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  

	}
}
