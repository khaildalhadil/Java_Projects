import java.util.Scanner;

public class Calc {
	public static void main(String argas[]) {
	
		Scanner s = new Scanner(System.in);

		int a, b, total ;

		System.out.println("Enter Two Number: ");
	
		a = s.nextInt();
		b = s.nextInt();
		total = a + b;

		System.out.println("The Sum Is " + total );
	
	}
		
}
