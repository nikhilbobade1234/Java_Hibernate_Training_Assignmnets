package com.exceptionhandling.assignment2;

public class Attendance { 
	int b=0;
	int count = 0 ;
	char Arr[]= {'p','p','p','p','p','p','p','l','p','p','l','p','l','p','p','p','n','p','p','p','p','p','p','p','p','p','p','p','p','p','p'};
	int sal=0;
	int a=0;
	
	int presentdays[]=new int[31];
	public void present() throws EmployeeAbscondingException {
     for(int i=1;i<=30;i++) {
		
		if(Arr[i]=='p') {
			 
			presentdays[i]=1;
			count++;
			
			}

		else
				{presentdays[i]=0;}
		if(Arr[i]=='n') {
			a++;
			
		}
		
			System.out.print(presentdays[i]+" ");
		}
	System.out.println();
if(a>4) {
	throw new EmployeeAbscondingException("no information exceeded");
} else
		{sal=count*500;
		System.out.println("total days present:-"+count+" salary per day:-"+500);
		System.out.println("salary of employee:-"+sal);
		}
	}
	public void leave() throws LeaveExceedLimitException  {
		for(int j=1;j<=30;j++) {
			if(Arr[j]=='l') {
				b++;
				
			}
		}
		if(b>2) {
			throw new LeaveExceedLimitException("leave exceeded`");
		}
	}
public static void main(String[] args) {
	Attendance attendance=new Attendance();

	try {
		attendance.present();
	} catch (EmployeeAbscondingException e1) {
		System.out.println(e1.getMessge());
	}
	try {
		attendance.leave();
	} catch (LeaveExceedLimitException e) {
		System.out.println(e.getMessage());
	}
}	
}

	


	




