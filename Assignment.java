package operators;
import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int a = scan.nextInt();
		
		System.out.println("Enter the number=");
		int b = scan.nextInt();
		
		System.out.println("equal" + (a=b));
		System.out.println((a+=b));
		System.out.println((a-=b));
		System.out.println((a*=b));
		System.out.println((a/=b));
		System.out.println((a++));
		System.out.println((a--));






	}

}
