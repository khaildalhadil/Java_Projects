import java.util.Scanner;

public class Tip {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);

		System.out.print("Welcome to the tip calulator! ");

		System.out.print("What was the total bill? ");
		float total = s.nextInt();

		System.out.print("How much tip would you like to give? 10, 12 or 15? ");
		int tip = s.nextInt();

		System.out.print("How many people to split the bill? ");
		int splitNum = s.nextInt();

		float totalForEach = ((total + tip) / splitNum);

		System.out.println("Each person should pay: $" + totalForEach);

	}
}