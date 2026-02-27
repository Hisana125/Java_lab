import java.util.Scanner;
class Complex {
	double real, imaginary;
	Complex(double r, double i) {
		real = r;
		imaginary = i;
	}
	Complex add(Complex c) {
		double newReal = this.real + c.real;
		double newImaginary = this.imaginary + c.imaginary;
		return new Complex(newReal,newImaginary);
	}
	void display() {
		System.out.println(real + "+" + imaginary + "i");
	}
}
public class ComplexAddition {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
       System.out.println("Enter real and imaginary part of first complex number:");
double r1 = sc.nextDouble();
double i1 = sc.nextDouble();
System.out.println("Enter real and imaginary part of second complex number:");
double r2 = sc.nextDouble();
double i2 = sc.nextDouble();
Complex c1 = new Complex(r1,i1);
Complex c2 = new Complex(r2,i2);
Complex result = c1.add(c2);
System.out.print("Result: ");
result.display();
sc.close();
	}
}
