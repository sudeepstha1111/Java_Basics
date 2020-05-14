import java.util.Scanner;
public class one {
  public static void main(String[] args) {
    Scanner cal = new Scanner(System.in);
      System.out.println("Enter First number:");
      int a = cal.nextInt();

      System.out.println("Enter Second number:");
      int b = cal.nextInt();

      System.out.println("Select your operation");
      System.out.println("Type a for addition: Type s for Subtraction: Type m for Multiplication: Type d for Division ");
      char character = cal.next().charAt(0);

      switch(character) {
      case 'a':
        System.out.println(" The sum of the two number" + (a+b));
        break;
      case 's':
        System.out.println(" The Difference of the two number" + (a-b));
        break;
      case 'm':
        System.out.println(" The multiplication of the two number" + (a*b));
        break;
      case 'd':
        System.out.println(" The division of the two number" + (a/b));
        break;
      default:
        System.out.println("Please enter correct Operation");
      }
    }
  }

