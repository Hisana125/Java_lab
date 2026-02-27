import java.util.Scanner;
public class Product {
	int pcode;
	String pname;
	double price;
	Product(int code,String name,double pr) {
		pcode=code;
		pname=name;
		price=pr;
	}
	void display() {
		System.out.println("Product Code: "+pcode);
		System.out.println("Product Name: "+pname);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details for product 1: ");
		System.out.println("Enter Product Code: ");
		int code1=sc.nextInt();
		System.out.println("Enter Product Name: ");
		String name1=sc.next();
		System.out.println("Enter Price: ");
		double price1=sc.nextDouble();
		Product p1=new Product(code1,name1,price1);
		System.out.println("\nEnter details for Product 2:");
		System.out.print("Enter Product Code:");
		int code2=sc.nextInt();
		System.out.print("Enter Product Name:");
		String name2=sc.next();
		System.out.print("Enter Price:");
		double price2=sc.nextDouble();
		Product p2=new Product(code2,name2,price2);
		System.out.println("\nEnter details for Product 3:");
                System.out.print("Enter Product Code:");
                int code3=sc.nextInt();
                System.out.print("Enter Product Name:");
                String name3=sc.next();
                System.out.print("Enter Price:");
                double price3=sc.nextDouble();
                Product p3=new Product(code3,name3,price3);
		Product lowest=p1;
		if(p2.price<lowest.price){
			lowest=p2;
		}
		if(p3.price<lowest.price){
			lowest=p3;
		}
		System.out.println("\nProduct with Lowest Price:");
		lowest.display();
		sc.close();
	}
}


