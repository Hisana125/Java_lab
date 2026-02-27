import java.util.Scanner;
class Student {
	String name;
	int rollNo;
	int marks;
	Student(String name,int rollNo,int marks) {
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
		void checkEligibility() {
			if(marks >=40) {
				System.out.println(name +" (Roll No: " + rollNo + ") is Eligible for Exam.");
			} else {
				System.out.println(name + " (Roll No: " + rollNo + ") is Not Eligible for Exam.");
			}
		}
	}
	public class Main {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				for (int i = 1; i<=3; i++) {
					System.out.println("\nEnter details for Student " + i);
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Roll Number: ");
					int rollNo = sc.nextInt();
					System.out.print("Enter Marks: ");
					int marks = sc.nextInt();
					sc.nextLine();
					Student s = new Student(name, rollNo, marks);
					s.checkEligibility();
				}
				sc.close();
			}
}
