package operators;
import java.util.Scanner;
public class comparision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the a value");
		int a = scan.nextInt();
		
		System.out.println("Enter the b value");
		int b = scan.nextInt();
		
		System.out.println("Is a equal to b" +"\n" + (a==b));
		System.out.println("Is a not equal to b" + "\n" +(a!=b));
		System.out.println("Is a greater than b" +"\n" +(a>b));
		System.out.println("Is a lessthan than b" +"\n" +(a<b));
		System.out.println("Is a greater than equal to b" +"\n" +(a>=b));
		System.out.println("Is a lessthan than equal to b" +"\n" +(a<=b));
		System.out.println("Is a lessthan than equal to b" +"\n" +(a<<b));
		
		
		
				;

	}

}
