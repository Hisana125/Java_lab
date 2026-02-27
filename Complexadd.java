class Complex {
	double real, imaginary;
	Complex(double r, double i) {
		real=r;
		imaginary=i;
	}
	Complex add(Complex c) {
		double newReal=this.real+c.real;
		double newImaginary=this.imaginary+c.imaginary;
		return new Complex(newReal,newImaginary);
	}
	void display() {
		System.out.println(real + " + " + imaginary + "i");
	}
}
public class Complexadd {
	public static void main(String[] args) {
		Complex c1 = new Complex(3, 4);
		Complex c2 = new Complex(5, 6);
		Complex result = c1.add(c2);
		System.out.print("Result: ");
		result.display();
	}
}
