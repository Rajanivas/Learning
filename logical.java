package operators;
import java.util.Scanner;
public class logical {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the boolean value m=");
		boolean m = scan.nextBoolean();
		
		System.out.println("Enter the boolean value n=");
		boolean n = scan.nextBoolean();
		
		System.out.println(m&&n);
		System.out.println(m||n);
		System.out.println(m&&m);
		System.out.println(m&&n);
		System.out.println(n&&n);
		System.out.println(n||n);
		
	}

}
