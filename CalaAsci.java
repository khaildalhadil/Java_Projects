import java.util.Scanner;


public class CalaAsci {
  public static void main(String argas[]) {
    showLogo();
    calcForUser();
  }

  public static void calcForUser() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Waht's the first number?: ");
    int firstNam = sc.nextInt();

    System.out.println(" + \n - \n * \n / Pick an operation");
    char type = sc.next().charAt(0);

    System.out.print("Waht's the Second number?: ");
    int secondNam = sc.nextInt();

    if (type == '+') {
      System.out.println(type);
    } else {
      System.out.println("Not Work");
    }

  }



  public static void showLogo() {
    System.out.println(
      " __________\n" +
      "| ________ |\n" +
      "||12345678||\n" +
      "|\"\"\"\"\"\"\"\"\"\"|\n" +
      "|[M|#|C][-]|\n" +
      "|[7|8|9][+]|\n" +
      "|[4|5|6][x]|\n" +
      "|[1|2|3][%]|\n" +
      "|[.|O|:][=]|\n" +
      "\"----------\""
    );
  }
}