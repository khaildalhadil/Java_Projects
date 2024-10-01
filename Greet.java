import java.util.Scanner;

public class Greet{
	public static void main(String argas[]){
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter Your Name: ");

		String name = s.nextLine();

		System.out.println("Hello, " + name + "!");
	}	
		
}