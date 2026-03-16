import java.util.Scanner;
class AreaShapes {
	double area(double r) {
		return 3.14 * r * r;
	}
	double area(double l, double b) {
		return l * b;
	}
	double area(double b, double h, int t) {
		return 0.5 * b * h;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AreaShapes obj = new AreaShapes();
		System.out.println("Choose Shape");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.print("Enter radius: ");
				double r = sc.nextDouble();
				System.out.println("Area of Circle = " + obj.area(r));
				break;
			case 2:
				System.out.print("Enter length: ");
				double l = sc.nextDouble();
				System.out.print("Enter breadth: ");
				double b = sc.nextDouble();
				System.out.println("Area of Rectangle = " + obj.area(l, b));
				break;
			case 3:
				System.out.print("Enter base: ");
				double base = sc.nextDouble();
				System.out.print("Enter height: ");
				double h = sc.nextDouble();
				System.out.println("Area of Triangle = " + obj.area(base, h, 1));
				break;
			default:
				System.out.println("Invalid choice");
		}
		sc.close();
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
