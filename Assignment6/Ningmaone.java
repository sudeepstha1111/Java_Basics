import java.util.Scanner; 

public class Ningmaone{

public static void main(String[] args) {
Scanner scan  = new Scanner(System.in);
String nice;
    
System.out.println("Welcome ");
System.out.println("What is your name?"); 
nice = scan.nextLine();
System.out.println("Hello: " + nice + " Where would you like to go?");        

Scanner hat = new Scanner(System.in);
String map;
map = hat.nextLine();
System.out.println("Hello " + nice + "!! " + "The " + map + " sounds like a great trip hope you will like the trip");  
}
}
