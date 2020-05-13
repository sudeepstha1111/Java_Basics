import java.util.Scanner;

public class ScannerInput{

public static void main(String args []){

Scanner input = new Scanner(System.in);

System.out.println("Welcome to my Program");
System.out.println("Enter your age");

//int age = 5;
int age = input.nextInt();
input.nextLine();
System.out.println("Enter your name");
String name = input.nextLine();

System.out.println("My age is : "+ age+ "  and My Name is : "+ name);



}



}
