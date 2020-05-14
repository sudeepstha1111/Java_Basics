import java.util.Scanner;
public class loopone {

public static void main(String[] args)
 {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a factorial number");
int F= scan.nextInt();

int  fac = 1;

 for(int i = 1; i <= F; i++)
        {
         fac = fac * i;
        }

        System.out.println("The factorial is " +fac);
    }
}
