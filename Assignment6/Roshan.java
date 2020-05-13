import java.util.Scanner; 

public class Roshan{

public static void main(String[] args) {
Scanner object = new Scanner(System.in);
String person;
    
System.out.println("Welcome to our site");
System.out.println("What is your name?"); 
person = object.nextLine();
System.out.println("Hello: " + person + " Where would you like to go?");        

Scanner objecta = new Scanner(System.in);
String place;
place = objecta.nextLine();
System.out.println("The " + place + " is a great destination hope you will like the trip");  
}
}
