package operators;
import java.util.Scanner;
public class unaryoperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value a=");
		int a = scan.nextInt();
		int b = +a;
		System.out.println(b);
		System.out.println(a);
		

	}

}
