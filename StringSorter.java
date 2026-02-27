import java.util.*;
public class StringSorter {
	public static void bubbleSort(String[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - i - 1; j++) {
				if(arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j +1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		System.out.println("enter the strings:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		System.out.println("\nMenu:");
		System.out.println("1 -> Built-in Sorting");
		System.out.println("2 -> User-defined Sorting");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch (choice) {
			case 1:
				Arrays.sort(arr);
				System.out.println("\nSorted using Built-in Method:");
				break;
			case 2:
				bubbleSort(arr);
				System.out.println("\nSorted using User-defined Method (Bubble Sort):");
				break;
			default:
				System.out.println("Invalid choice!");
				return;
		}
		for (String str : arr) {
			System.out.println(str);
		}
		sc.close();
	}
}
