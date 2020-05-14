import java.util.Scanner;
public class loop {

public static void main(String[] args)
 {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a natural number");
int N= scan.nextInt();
int sum=0;

 for(int i = 1; i <= N; i++)
        {
         sum = sum + i;
        }

        System.out.println("Sum is "+sum); 
    }
}

