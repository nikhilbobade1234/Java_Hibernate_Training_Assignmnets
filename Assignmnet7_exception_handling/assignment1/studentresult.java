package com.exceptionhandling.assignment1;

public class studentresult {
	int math;
	int science;
	int marathi;
	int english;
	int hindi;
	int result;
	public int getResult() {
		return result;
	}

	public void setResult() throws failexception {
		if((math+english+hindi+marathi+science)/5<40) {
			throw new failexception("student is fail" );
		}
		else this.result=(math+english+hindi+marathi+science)/100;
	}

	public studentresult(int math, int science, int marathi, int english, int hindi,int result) {
		super();
		this.math = math;
		this.science = science;
		this.marathi = marathi;
		this.english = english;
		this.hindi = hindi;
		this.result=result;
	}

	public studentresult() {
		// TODO Auto-generated constructor stub
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) throws failexception {
		if(math<40 &&math<0) {
			throw new failexception("student fail in maths");
			
		}else this.math=math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) throws failexception {
		if(science<40 &&science<0) {
			throw new failexception("student fail in science");
		}
		this.science = science;
	}

	public int getMarathi() {
		return marathi;
	}

	public void setMarathi(int marathi) throws failexception {
		if(marathi<40&& marathi<0) {
			throw new failexception("student fail in marathi");
		}
		this.marathi = marathi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) throws failexception {
		if(english<40 && english<0) {
			throw new failexception("student fail in english");
			
		}
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) throws failexception {
		if(hindi<40 &&hindi<0) {
			throw new failexception("student fail in hindi");
		}
		this.hindi = hindi;
	}

	public void result() throws failexception {
		studentresult sr=new studentresult();
		try {
		sr.setEnglish(60);
		}catch(failexception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			
		
		sr.setHindi(66);
		}catch(failexception e) {
			System.out.println(e.getMessage());
		}
		try {
		sr.setMarathi(55);
		}catch(failexception m) {
			System.out.println(m.getMessage());
		}
		try {
		sr.setMath(66);
		}catch(failexception m1) {
			System.out.println(m1.getMessage());
		}
		try {
		sr.setScience(-77);
		}
		catch(failexception s) {
			System.out.println(s.getMessage());
		}
		try {
			sr.setResult();
		}catch(failexception f) {
			System.out.println(f.getMessage());
		}
	}

}
