import java.util.Scanner;
class Publisher {
	String publisherName;
	void getPublisher(Scanner sc) {
		System.out.print("Enter Publisher Name: ");
		publisherName = sc.nextLine();
	}
	void displayPublisher() {
		System.out.println("Publisher: " + publisherName);
	}
}
class Book extends Publisher {
	String title;
	String author;
	void getBook(Scanner sc) {
		System.out.print("Enter Book Title: ");
		title = sc.nextLine();
		System.out.print("Enter Author Name: ");
		author = sc.nextLine();
		getPublisher(sc);
	}
	void displayBook() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		displayPublisher();
	}
}
class Literature extends Book {
	void getLiterature(Scanner sc) {
		System.out.println("\nEnter Literarture Book Details:");
		getBook(sc);
	}
	void displayLiterature() {
		System.out.println("\n--- Literature Book Details ---");
		displayBook();
	}
}
class Fiction extends Book {
	void getFiction(Scanner sc) {
		System.out.println("\nEnter Fiction Book Details:");
		getBook(sc);
	}
	void displayFiction() {
		System.out.println("\n--- Fiction Book Details ---");
		displayBook();
	}
}
public class BookInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Literature l = new Literature();
		Fiction f = new Fiction();
		int choice;
		System.out.println("Choose Category:");
		System.out.println("1.Literature");
		System.out.println("2.Fiction");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
			case 1:
				l.getLiterature(sc);
				l.displayLiterature();
				break;
			case 2:
				f.getFiction(sc);
				f.displayFiction();
				break;
			default:
				System.out.println("Invalid Choice");
		}
		sc.close();
	}
}
