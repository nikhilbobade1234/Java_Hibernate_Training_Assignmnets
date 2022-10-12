package Assignment_2nd_Days;

public class ComplexNumber {
	double RealNumber;
	double imaginaryNumber;

	public ComplexNumber(double real, double imag) {
		this.RealNumber = real;
		this.imaginaryNumber = imag;
	}

	public static void main(String[] args) {
		ComplexNumber n1 = new ComplexNumber(6.3, 7.5);
		ComplexNumber n2 = new ComplexNumber(3.4, 3.0),
				 temp;

		temp = add(n1, n2);

		System.out.printf("Sum = %.1f + %.1fi", temp.RealNumber, temp.imaginaryNumber);
	}

	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber temp = new ComplexNumber(0.0, 0.0);

		temp.RealNumber = n1.RealNumber + n2.RealNumber;
		temp.imaginaryNumber = n1.imaginaryNumber + n2.imaginaryNumber;

		return (temp);
	}
}
