import java.util.Scanner;
public class StringManipulation
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first string: ");
	String str1=sc.nextLine();
	System.out.print("Enter second string: ");
	String str2=sc.nextLine();
	System.out.println("Length of first string: "+str1.length());
	String concatStr=str1.concat(str2);
	System.out.println("Concatenated string: "+concatStr);
	System.out.println("Character at index 1 of first string: "+str1.charAt(1));
	char[] ch=new char[3];
	concatStr.getChars(0,3,ch,0);
	System.out.print("Characters copied using getChars(): ");
	System.out.println(ch);
	System.out.println("compareTo result: "+str1.compareTo(str2));
	System.out.println("Strings are equal: "+str1.equals(str2));
	System.out.println("Strings are equal (ignore case): "+str1.equalsIgnoreCase(str2));
	System.out.println("First string starts with 'He': "+str1.startsWith("He"));
	System.out.println("Second string ends with 'Id': "+str2.endsWith("Id"));
	System.out.println("First string contains 'a': "+str1.contains("a"));
	System.out.println("Index of 'o' in first string: "+str1.indexOf('o'));
	System.out.println("First string in uppercase: "+str1.toUpperCase());
	System.out.println("Second string in lowercase: "+str2.toLowerCase());
	System.out.println("Replace 'a' with 'x' in first string: "+str1.replace('a','x'));
	System.out.print("Enter a double value as string: ");
	String doubleStr=sc.nextLine();
	Double d=Double.valueOf(doubleStr);
	System.out.println("Converted Double value: "+d);
	System.out.print("Enter an integer value as string: ");
	String intStr=sc.nextLine();
	Integer i=Integer.valueOf(intStr);
	System.out.println("Converted Integer value: "+i);
	sc.close();
	}
}
